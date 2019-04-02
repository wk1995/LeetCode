package com.wk.order

import com.wk.StaticMethod

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/12/8/14:43
 *      desc   : 快速排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(StaticMethod.UNUSED)
class QuickSort<T : Comparable<T>> : Sort<T>() {

    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        if (sortList.size <= 1)
            return sortList
        val result = ArrayList<T>()
        val taget = sortList[0]
        val left = ArrayList<T>()
        val right = ArrayList<T>()
        for (i in 1 until sortList.size) {
            val it = sortList[i]
            if (it > taget)
                right.add(it)
            else
                left.add(it)
        }
        result.addAll(ascSort(left))
        result.add(taget)
        result.addAll(ascSort(right))
        return result
    }
}