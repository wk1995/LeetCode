package com.wk.exercise.leetcode;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/3/19 <br/>
 *      desc   :  409. 最长回文串        <br/>

给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。

在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。

注意:
假设字符串的长度不会超过 1010。

示例 1:

输入:
"abccccdd"

输出:
7

解释:
我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。



 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
public class Q409 implements Q {
    @Override
    public void answer() {
       System.out.println(longestPalindrome("ccc"));
    }

    private  int longestPalindrome(String s) {
        int result=0;
        if(s==null || s.isEmpty()){
            return result;
        }
        int sum=Math.abs('z'-'A'+1);
        int[] save=new int[sum];
        for(char ch:s.toCharArray()){
            save[ch-'A']++;
        }
        for(int i:save){
            if(i%2==0 ){
                result+=i;
            }else if(i>1){
                result+=i-1;
            }
        }
        if(result<s.length()){
            result++;
        }
        return result;
    }
}
