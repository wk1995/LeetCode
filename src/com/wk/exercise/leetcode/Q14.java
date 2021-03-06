package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.exercise.ByteBounce202010;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/09/27
 *      desc   : 最长公共前缀
 *
         编写一个函数来查找字符串数组中的最长公共前缀。

         如果不存在公共前缀，返回空字符串 ""。

         示例 1:

         输入: ["flower","flow","flight"]
         输出: "fl"
         示例 2:

         输入: ["dog","racecar","car"]
         输出: ""
         解释: 输入不存在公共前缀。
         说明:

         所有输入只包含小写字母 a-z 。


 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q14 implements Q,ByteBounce202010 {
    @Override
    public void answer() {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    private String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String result = "";
        String target = strs[0];
        boolean flag = true;
        for (int j = 1; j <= target.length(); j++) {
            String s = target.substring(0, j);
            for (int k = 1; k < strs.length; k++) {
                if (!strs[k].startsWith(s)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (s.length() > result.length()) {
                    result = s;
                }
            }

        }

        return result;
    }

    /**
     * 思路：
     * 从每个字符串的第一个字符开始对比，遍历，
     * 若全部都相同，放入stringBuilder中，只要有一个不同，则直接抛出
     * */
    private String longestCommonPrefix1(String[] strs){
        if(strs==null){
            return "";
        }
        int size=strs.length;
        if(size<=0){
            return "";
        }
        StringBuilder result=new StringBuilder();
        char point='\u0000';
        for(int i=0;;i++){
            for(int j=0;j<size;j++){
                String str=strs[j];
                if(str==null){
                    return "";
                }
                int length=str.length();
                if(length<=i){
                    return result.toString();
                }
                if(j==0){
                    point=str.charAt(i);
                }else{
                    if(point!=str.charAt(i)){
                        return result.toString();
                    }
                }
            }
            result.append(point);
        }

    }
}
