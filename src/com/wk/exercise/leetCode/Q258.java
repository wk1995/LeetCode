package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/8/19/7:19
 *      desc   : 各位相加
 *
         *      给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
         *
         * 示例:
         *
         * 输入: 38
         * 输出: 2
         * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
         * 进阶:
         * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q258  implements Q {
    @Override
    public void answer() {
        int num=38;
        System.out.println(addDigits(num));
    }
    private int addDigits(int num){
        int sum=num%10;
        while(num/10!=0){
            num/=10;
            sum+=num%10;

        }
        if(sum/10==0) return sum;
        return addDigits(sum);
    }
}
