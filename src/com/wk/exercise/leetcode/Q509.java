package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/4/16/7:55
 *      desc   : 斐波那契数

            斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：

             F(0) = 0,   F(1) = 1
             F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

             给定 N，计算 F(N)。



             示例 1：

             输入：2
             输出：1
             解释：F(2) = F(1) + F(0) = 1 + 0 = 1.

             示例 2：

             输入：3
             输出：2
             解释：F(3) = F(2) + F(1) = 1 + 1 = 2.

             示例 3：

             输入：4
             输出：3
             解释：F(4) = F(3) + F(2) = 2 + 1 = 3.

 *      address: https://leetcode-cn.com/problems/fibonacci-number/comments/
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q509 implements Q {
    private int unit=2;
    @Override
    public void answer() {
        int n=2;
        System.out.println(fib2(n));
    }
    private  int fib(int n) {
        if(n<unit) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    private int fib2(int n){
        if(n<unit) {
            return n;
        }
        int[] result=new int[n+1];
        result[0]=0;
        result[1]=1;
        for(int i=2;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }
}
