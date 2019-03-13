package com.wk.order

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/11/26/22:59
 *      desc   : 选择排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class SelectionSort<T : Comparable<Any>> : Sort<T>() {
    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        val sorts = ArrayList<T>()
        for (i in sortList.indices) {
            var max = sortList[0]
            var tmp = 0
            for (j in sortList.indices) {
                if (sortList[j] >= max) {
                    tmp = j
                    max = sortList[j]
                }
            }
            sorts.add(sortList[tmp])
            sortList.remove(sortList[tmp])
        }
        return sorts
    }
}