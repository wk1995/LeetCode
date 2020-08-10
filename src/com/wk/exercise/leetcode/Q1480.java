package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.Arrays;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/8/10 <br/>
 *      desc   : 答案的模板         <br/>
 *
 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q1480 implements Q {
    @Override
    public void answer() {
        int[] ints={1,2,3};
        System.out.println(Arrays.toString(runningSum(ints)));
    }

    private  int[] runningSum(int[] nums) {
        if (nums == null) {
            return null;
        }
        int size = nums.length;
        int[] result = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
