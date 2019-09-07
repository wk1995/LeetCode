package com.wk.exercise.leetcode;

import com.wk.StaticMethod;
import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/17
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q832 implements Q {
    @Override
    public void answer() {
        Integer[][] a={{1,1,0},{1,0,1},{0,0,0}};
        for (Integer[] integers : a) {
            swapArray(integers);
        }
       StaticMethod.INSTANCE.ergodicTwoDimensionalArray(a);
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                a[i][j]=a[i][j]^1;
            }
        }
        StaticMethod.INSTANCE.ergodicTwoDimensionalArray(a);

    }

    private static void swapArray(Integer[] a){
        int unit=2;
        for(int j=0;j<=a.length/unit-1;j++){
            a[j]=a[j]^a[a.length-1-j];
            a[a.length-1-j]=a[j]^a[a.length-1-j];
            a[j]=a[j]^a[a.length-1-j];
        }

    }
}
