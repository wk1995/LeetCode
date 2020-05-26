package com.wk.exercise.leetcode;

import java.util.HashMap;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/5/26 <br/>
 *      desc   :  寻找重复数        <br/>

给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。

示例 1:

输入: [1,3,4,2,2]
输出: 2
示例 2:

输入: [3,1,3,4,2]
输出: 3
说明：

不能更改原数组（假设数组是只读的）。
只能使用额外的 O(1) 的空间。
时间复杂度小于 O(n2) 。
数组中只有一个重复的数字，但它可能不止重复出现一次。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-the-duplicate-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
public class Q287 implements Q {
    @Override
    public void answer() {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    private int findDuplicate(int[] nums) {
        return findDuplicateByMap(nums);
    }

    private int findDuplicateByMap(int[] nums) {
        if(nums==null || nums.length<2){
            throw new IllegalArgumentException("not exits reapet num");
        }
        int length=nums.length;
        HashMap<Integer,Integer> resultMap=new HashMap<>(length);
        for(int num:nums){
            Integer value=resultMap.get(num);
            if(value==null){
                resultMap.put(num,1);
            }else{
                return num;
            }
        }
        throw new IllegalArgumentException("not exits reapet num");
    }
}
