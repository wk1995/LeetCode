package com.wk.exercise.leetCode

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/28/21:29
 *      desc   : 最小差值 II
            给定一个整数数组 A，对于每个整数 A[i]，我们可以选择 x = -K 或是 x = K，并将 x 加到 A[i] 中。

            在此过程之后，我们得到一些数组 B。

            返回 B 的最大值和 B 的最小值之间可能存在的最小差值。

            示例 1：

            输入：A = [1], K = 0
            输出：0
            解释：B = [1]
            示例 2：

            输入：A = [0,10], K = 2
            输出：6
            解释：B = [2,8]
            示例 3：

            输入：A = [1,3,6], K = 3
            输出：3
            解释：B = [4,6,3]


            提示：

            1 <= A.length <= 10000
            0 <= A[i] <= 10000
            0 <= K <= 10000
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q910:Q {
    override fun answer() {
        val a= intArrayOf(0,10)
        val k=0
        println(smallestRangeII(a,k))
    }

    private fun smallestRangeII(A: IntArray, K: Int): Int {
        val min=getMinValue(A)
        var flag=0
        while(flag<A.size){


            flag++
        }
        return 0
    }

    private fun getMinValue(b:IntArray):Int{
        var min=Int.MAX_VALUE
        var max=Int.MIN_VALUE
        b.forEach {
            it->
            if(min>it) min=it
            if(max<it) max=it
        }
        return max-min
    }
}