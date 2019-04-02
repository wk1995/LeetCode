package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/30
 *      desc   :
 *      回文数
         判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

         示例 1:

         输入: 121
         输出: true
         示例 2:

         输入: -121
         输出: false
         解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
         示例 3:

         输入: 10
         输出: false
         解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q9 implements Q {
    @Override
    public void answer() {
        int x=121;
        char[] cs=String.valueOf(x).toCharArray();
        if(cs.length==1)
        {
            System.out.println(true);
            return;
        }
        for (int i=0,j=cs.length-1;i<j;i++,j--){
            if(cs[i]!=cs[j]){
                System.out.println(false);
                return;
            }

        }
        System.out.println(true);
    }
}
