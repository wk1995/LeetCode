package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/11/3 <br/>
 *      desc   :  有效的山脉数组        <br/>

给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。

让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：

A.length >= 3
在 0 < i < A.length - 1 条件下，存在 i 使得：
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
 


示例 1：

输入：[2,1]
输出：false
示例 2：

输入：[3,5,5]
输出：false
示例 3：

输入：[0,3,2,1]
输出：true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-mountain-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 *      address: https://leetcode-cn.com/problems/valid-mountain-array/
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q941 implements Q {
    @Override
    public void answer() {

    }
    private boolean validMountainArray(int[] A) {
        if(A==null){
            return false;
        }
        int length=A.length;
        if(length<3){
            return false;
        }
        int target=Integer.MAX_VALUE;
        for(int i=0;i<length-1;i++){
            if(A[i]==A[i+1]){
                return false;
            }else if(A[i]>A[i+1]){
                if(i==0){
                    return false;
                }
                target=i;
            }else if(A[i]<A[i+1]){
                if(i>target){
                    return  false;
                }
            }
        }
        if(target==Integer.MAX_VALUE){
            return false;
        }
        return true;
    }
}
