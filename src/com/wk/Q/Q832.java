package com.wk.Q;

import com.wk.StaticMethod;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/17
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q832 implements Q {
    @Override
    public void answer() {
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<A.length;i++){
            swapArray(A[i]);
        }
       StaticMethod.INSTANCE.ergodicTwoDimensionalArray(A);
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A[i].length;j++)
                A[i][j]=A[i][j]^1;
        StaticMethod.INSTANCE.ergodicTwoDimensionalArray(A);

    }

    private static void swapArray(int[] a){
        for(int j=0;j<=a.length/2-1;j++){
            a[j]=a[j]^a[a.length-1-j];
            a[a.length-1-j]=a[j]^a[a.length-1-j];
            a[j]=a[j]^a[a.length-1-j];
        }

    }
}
