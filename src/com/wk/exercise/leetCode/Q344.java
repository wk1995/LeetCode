package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/2018/7/26
 *      desc   :
 *
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 *
 * 示例：
 *
 * 输入：s = "hello"
 * 返回："olleh"
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q344 implements Q {

    @Override
    public void answer() {
        String s="hello";
        if(s.isEmpty() || s.length()==1 || s==null)
            System.out.println(s);
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(s.length()-1-i);
        }
        System.out.println(new String(c));
    }
}
