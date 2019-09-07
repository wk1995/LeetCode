package com.wk.exercise.leetcode

import com.wk.StaticMethod
import com.wk.SuppressConstant

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/4/10/7:48
 *      desc   : 按奇偶排序数组

    给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。

    你可以返回满足此条件的任何数组作为答案。



    示例：

    输入：[3,1,2,4]
    输出：[2,4,3,1]
    输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。



 *      address: https://leetcode-cn.com/problems/sort-array-by-parity/submissions/
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(SuppressConstant.UNUSED)
class Q905:Q {
    override fun answer() {
        val a=intArrayOf(3,1,2,4)
    }
    private fun sortArrayByParity(A: IntArray): IntArray {
        val size=A.size
        val result=IntArray(size)
        var i=0
        var j=size-1
        A.forEach {
            if(it%2==0) {//偶数
                result[i] = it
                i++
            }else{
                result[j]=it
                j--
            }
        }
        return result
    }
}