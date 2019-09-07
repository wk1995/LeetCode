package com.wk.exercise.leetcode;

import com.wk.CollectionHelper;
import com.wk.SuppressConstant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.wk.SuppressConstant.UNUSED;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/majority-element/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 求众数

 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

 你可以假设数组是非空的，并且给定的数组总是存在众数。

 示例 1:

 输入: [3,2,3]
 输出: 3
 示例 2:

 输入: [2,2,1,1,1,2,2]
 输出: 2

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/majority-element
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q169 implements Q{

    @Override
    public void answer() {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }

    private int majorityElement(int[] nums) {
        if(CollectionHelper.isEmpty(nums)) {
            return 0;
        }
        return majorityElementByBoyerMoore(nums);
    }

    /**
     * 1.Boyer-Moore投票算法
     * 算法：把众数看成1，不是众数看成-1，因为众数个数大于n/2，只要是最后结果大于0的
     * 那这个数就是众数
     * 思路1：从第一个数开始轮流当众数，时间复杂度为O(n^2)
     * 思路2：第一个数当众数，当相加为0的时候，下一个数当众数。当相加为0的时候
     * 去掉的那些数中众数与非众数的个数是相等的。时间复杂度为O(n)
     * */
    private int majorityElementByBoyerMoore(int[] nums){
        int count=0;
        int boyer=0;
        for (int num : nums) {
            if(count==0){
                boyer=num;
            }
            count+=(boyer==num)?1:-1;
        }
        return boyer;
    }

    /**
     * 2.先排序，因为众数个数大于n/2,那么第n/2个数一定是众数
     * */
    @Deprecated
    private int majorityElementBySort(int[] nums){
        Arrays.sort(nums);
        int length=nums.length;
        return nums[length/2];
    }

    /**
     * 3.把各个数字当做key，计算出现次数，时间复杂度O(n),空间复杂度O(n)
     * */
    private int majorityElementByMap(int[] nums) throws Exception{
        int length=nums.length;
        Map<Integer,Integer> save=new HashMap<>(length);
        for(int num:nums){
            Integer count=save.get(num);
            save.put(num,count!=null?count+1:1);
            if(count!=null && count>length/2){
                return num;
            }
        }
        Map.Entry<Integer,Integer> result=null;
        for(Map.Entry<Integer,Integer> entry:save.entrySet()){
           if(result==null || entry.getValue()>=result.getValue()){
               result=entry;
           }
        }
        if(result!=null){
            return result.getKey();
        }else{
            throw new Exception("has no answer");
        }
    }
}
