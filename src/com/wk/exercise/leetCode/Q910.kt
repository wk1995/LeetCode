package com.wk.exercise.leetCode

import java.util.Arrays


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

思路：错误： 1.只有一个数的结果为0
2.B的max和min只能由A的max，min得来的，
1):A的max和min同增或同减，所求的也就是A的max与min差值
2):A的max减小，min增大得到B

我们可以先把A排序然后我们可以想象A的值处于x轴的坐标上
A的每个值对应的是该轴的坐标，其实这里只需要求出最大和最小
一般情况，就是最外的两个坐标往里缩，还有一种特殊情况，
就是往里缩的位移太大，大于两个坐标原本的距离

理由：中间有数+k或者-k可能会大于A[max]-k,A[min]+k
正确：先排序，在某一个节点，之前的数全部加K，之后的数全部减K

 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q910 : Q {
    override fun answer() {
        val a = intArrayOf(0, 10)
        val k = 0
        println(smallestRangeII(a, k))
    }

    private fun smallestRangeII(A: IntArray, K: Int): Int {
        val n = A.size
        if (n <= 1) return 0
        Arrays.sort(A)
        var res = A[n - 1] - A[0]
        for (i in 1 until n) {
            val min = Math.min(A[0] + K, A[i] - K)
            val max = Math.max(A[n - 1] - K, A[i - 1] + K)
            res = Math.min(max - min, res)
        }
        return res
    }


}