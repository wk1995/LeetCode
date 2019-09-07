package com.wk.exercise.leetcode;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/08/2018/8/15
 *      desc   :
 *       Excel表列序号
 *       给定一个Excel表格中的列名称，返回其相应的列序号。
 *
         * 例如，
         *
         *     A -> 1
         *     B -> 2
         *     C -> 3
         *     ...
         *     Z -> 26
         *     AA -> 27
         *     AB -> 28
         *     ...
         * 示例 1:
         *
         * 输入: "A"
         * 输出: 1
         * 示例 2:
         *
         * 输入: "AB"
         * 输出: 28
         * 示例 3:
         *
         * 输入: "ZY"
         * 输出: 701
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q171 implements Q {
    @Override
    public void answer() {
        String s="ZY";
        int i=0;
        char[] cs=s.toCharArray();
        for(char c:cs){
            i*=26;
            i+=(int)c-(int)'A'+1;
        }
        System.out.println(i);
    }
}
