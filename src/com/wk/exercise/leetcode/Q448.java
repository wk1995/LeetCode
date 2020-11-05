package com.wk.exercise.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/11/1 <br/>
 *      desc   : 找到所有数组中消失的数字         <br/>
 *
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 示例:
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
public class Q448 implements Q {
    @Override
    public void answer() {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    private List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        int length = nums.length;
        if (length == 0) {
            return result;
        }
        for (int i = 0; i < length; i++) {
            while((i+1)!=nums[i] && nums[i]!=nums[nums[i]-1]){
                int tmp=nums[i];
                nums[i]=nums[tmp-1];
                nums[tmp-1]=tmp;
            }
        }
        for (int i = 0; i < length; i++) {
            if((i+1)!=nums[i]){
                result.add(i+1);
            }
        }
        return result;
    }


}
