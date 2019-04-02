package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/2018/7/27
 *      desc   : 反转字符串中的单词 III
 *
 *
 *      给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 *
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q557 implements Q {
    @Override
    public void answer() {
        String s="Let's take LeetCode contest";
        String[] ss=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s1:ss){
            char[] cs=s1.toCharArray();
            for(int i=0, t=cs.length-1;t>=i;i++,t--){
                char tmp=cs[i];
                cs[i]=cs[t];
                cs[t]=tmp;
            }
            sb.append(cs);
            sb.append(" ");
        }
        System.out.println(sb.toString().substring(0,sb.length()-1));
    }
}
