package com.wk.exercise.leetcode;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/3/5
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
public class Q137 implements Q {
    @Override
    public void answer() {
        int[] nums={2,2,3,2,};
        System.out.println(singleNumber(nums));
    }


    private int singleNumber(int[] nums) {
        int a=0,b=0;
        for(int n:nums){
            int x=a ^ n;
            int y=~b;
            a=(a ^ n) & ~b;
            int c=b ^ n;
            int d=~a;
            b=(b ^ n) & ~a;
        }
        return a;

    }
}