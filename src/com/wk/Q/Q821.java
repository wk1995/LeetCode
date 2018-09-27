package com.wk.Q;

import java.util.ArrayList;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/8/19/23:50
 *      desc   : 字符的最短距离
         *给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
         *
         * 示例 1:
         *
         * 输入: S = "loveleetcode", C = 'e'
         * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
         * 说明:
         *
         * 字符串 S 的长度范围为 [1, 10000]。
         * C 是一个单字符，且保证是字符串 S 里的字符。
         * S 和 C 中的所有字母均为小写字母。
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q821 implements Q {
    @Override
    public void answer() {
        String S="loveleetcode";
        char C='e';
        //用于存放S中所有C的位置
        ArrayList<Integer> list=new ArrayList<>();
        int[] result=new int[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C)
                list.add(i);
        }
        //取出S中的每个字符与各个C的距离的最小值
        for(int i=0;i<S.length();i++){
            int min=Integer.MAX_VALUE;

            for(int j:list){
                int r=Math.abs(j-i);
                if(r<min)
                    min=r;
            }
            result[i]=min;
        }

    }
}
