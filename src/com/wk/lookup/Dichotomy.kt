package com.wk.lookup

import com.wk.StaticMethod

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/11/19/23:09
 *      desc   : 二分法
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(StaticMethod.UNUSED)
class Dichotomy(private val list: ArrayList<Int>, private val target: Int) {
    private val size by lazy { list.size }
    fun lookup(): Int {
        return dichotomy(0, size)
    }

    private fun dichotomy(start: Int, end: Int): Int {
        if (start == end) {
            if (list[start] != target) throw Exception("未发现目标值")
            else return start
        }
        if (list[(start + end) / 2] > target)
            return dichotomy(start, (start + end) / 2)
        else if (list[(start + end) / 2] == target)
            return (start + end) / 2
        else
            return dichotomy((start + end) / 2, end)
    }
}