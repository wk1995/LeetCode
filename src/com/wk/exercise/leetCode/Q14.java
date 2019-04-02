package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
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
public class Q14 implements Q {
    @Override
    public void answer() {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    private String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
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
            if (flag)
                if (s.length() > result.length())
                    result = s;

        }

        return result;
    }
}
