package com.wk.exercise.leetcode

import java.util.*

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/4/3/21:10
 *      desc   : 有序数组的平方
 *      address: https://leetcode-cn.com/problems/squares-of-a-sorted-array/

给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。



示例 1：

输入：[-4,-1,0,3,10]
输出：[0,1,9,16,100]

示例 2：

输入：[-7,-3,2,3,11]
输出：[4,9,9,49,121]



提示：

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A 已按非递减顺序排序。





 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q977 : Q {
    override fun answer() {
        val a = intArrayOf(1)
        println(Arrays.toString(sortedSquares(a)))
    }

    private fun sortedSquares(A: IntArray): IntArray {
        val size = A.size
        if(size==1){
            A[0]=A[0]*A[0]
            return A
        }
        val result = IntArray(size)
        //falg表示最后一个负数的位置
        var flag = Int.MIN_VALUE
        for (i in 0 until size) {
            if (A[i] < 0)
                flag = i
            if (A[i + 1] >= 0)
                break
        }
        when (flag) {
            //说明没有负数
            Int.MIN_VALUE ->
                for (i in 0 until size) {
                    result[i] = A[i] * A[i]

                }
            //说明全是负数
            size - 1 -> {
                for (i in 0 until size) {
                    result[size - i - 1] = A[i] * A[i]
                }
            }
            else -> {
                //小于等于flag的都是负数
                var i = flag
                var j = flag + 1
                var index = 0
                while (i >= 0 && j < size) {
                    if (-A[i] > A[j]) {
                        result[index] = A[j] * A[j]
                        j++
                    } else {
                        result[index] = A[i] * A[i]
                        i--
                    }
                    index++
                }
                while (i >= 0) {
                    result[index] = A[i] * A[i]
                    i--
                    index++
                }
                while (j < size) {
                    result[index] = A[j] * A[j]
                    j++
                    index++
                }
            }
        }
        return result
    }
}