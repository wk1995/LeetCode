package com.wk.exercise.leetcode

import com.wk.StaticMethod
import com.wk.SuppressConstant
import java.util.*

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/4/15/7:37
 *      desc   : 按奇偶排序数组 II

给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。

对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。

你可以返回任何满足上述条件的数组作为答案。

示例：

输入：[4,2,5,7]
输出：[4,5,2,7]
解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。


 *      address: https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(SuppressConstant.UNUSED)
class Q922 : Q {

    override fun answer() {
        val a = intArrayOf(4, 2, 5, 7)
        println(Arrays.toString(sortArrayByParityII(a)))
    }

    private fun sortArrayByParityII(A: IntArray): IntArray {
        //本应该是放奇数的位置，是奇数位，但事实上对应的是偶数，取出来放入奇数
        val oddStack = Stack<Int>()
        val evenStack = Stack<Int>()
        for (i in A.indices) {
            //偶数
            if (i % 2 == 0) {
                //对应的值是奇数，应该先判断oddStack有没有，如果有
                //则取出来，调换位置，如果没有，
                if (A[i] % 2 == 1) {
                    if (oddStack.isNotEmpty()) {
                        val oddTop = oddStack.pop()
                        val tmp = A[oddTop]
                        A[oddTop] = A[i]
                        A[i] = tmp
                    } else
                        evenStack.push(i);
                }
            } else {
                //奇数
                if (A[i] % 2 == 0) {
                    if (evenStack.isNotEmpty()) {
                        val evenTop = evenStack.pop()
                        val tmp = A[evenTop]
                        A[evenTop] = A[i]
                        A[i] = tmp
                    } else
                        oddStack.push(i);
                }
            }
        }
        return A
    }
}