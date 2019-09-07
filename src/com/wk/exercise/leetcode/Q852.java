package com.wk.exercise.leetcode;

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
public class Q852 implements Q {
    @Override
    public void answer() {
        int[] a={0,1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,0};
        for(int i=1;i<a.length-1;i++){
            if(isMaxInLeft(a,i) && isMaxInRight(a,i)){
                System.out.println("第"+i+"位");
                return;
            }

        }
        System.out.println("没有");
    }
    private static boolean isMaxInLeft(int[] a,int i){
        while (i>0){
            if(a[i]<=a[i-1]) {
                return false;
            }
            i--;
        }
        return true;
    }
    private static boolean isMaxInRight(int[] a,int i){
        while (i<a.length-1){
            if(a[i]<=a[i+1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
