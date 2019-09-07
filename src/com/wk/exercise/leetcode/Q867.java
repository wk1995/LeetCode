package com.wk.exercise.leetcode;

import com.wk.StaticMethod;
import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/08/2018/8/16
 *      desc   : 转置矩阵
 *
         *      给定一个矩阵 A， 返回 A 的转置矩阵。
         *
         * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
         *
         *
         *
         * 示例 1：
         *
         * 输入：[[1,2,3],[4,5,6],[7,8,9]]
         * 输出：[[1,4,7],[2,5,8],[3,6,9]]
         * 示例 2：
         *
         * 输入：[[1,2,3],[4,5,6]]
         * 输出：[[1,4],[2,5],[3,6]]
         *
         *
         * 提示：
         *
         * 1 <= A.length <= 1000
         * 1 <= A[0].length <= 1000
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q867 implements Q {
    @Override
    public void answer() {
        int[][] a =new int[2][3];
        a [0][0]=1;
        a [0][1]=2;
        a [0][2]=3;
        a [1][0]=4;
        a [1][1]=5;
        a [1][2]=6;
        Integer[][] b=new Integer[a [0].length][a .length];
        for(int i=0;i<a .length;i++) {
            for(int j=0;j<a [i].length;j++) {
                b[j][i]=a [i][j];
            }
        }
        StaticMethod.INSTANCE.ergodicTwoDimensionalArray(b);

    }
}
