package com.wk.order

import com.wk.StaticMethod

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/2/26/21:25
 *      desc   : 归并排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(StaticMethod.UNUSED)
class MergeOrder<T : Comparable<T>> : Sort<T>() {

    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    /**
     * sortList每次都平分，直到一组最多只有两个T
     * 然后先各个组排序
     * 然后跟相邻的组排序合成一个大组
     * */
    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        val end = sortList.size
        merge(sortList, 0, end - 1)
        return sortList;
    }

    private fun merge(sortList: ArrayList<T>, first: Int, last: Int) {
        if (last - first == 1) {
            val lastValue = sortList[last]
            val firstValue = sortList[first]
            if (lastValue < firstValue) {
                sortList[last] = firstValue
                sortList[first] = lastValue
            }
        }
        if (last - first > 1) {
            val mid = (last - first+1) / 2 + first
            merge(sortList, first, mid)
            merge(sortList, mid + 1, last)
            mergeOrder(sortList, first, last, mid)
        }
    }

    private fun mergeOrder(sortList: ArrayList<T>, first: Int, last: Int, mid: Int) {
        val tmp = ArrayList<T>()
        var i = first
        var j = mid + 1
        while (i < j && i <= mid && j <= last) {
            if (sortList[i] > sortList[j]) {
                tmp.add(sortList[j])
                j++
            } else {
                tmp.add(sortList[i])
                i++
            }
        }
        for (x in i..mid) {
            tmp.add(sortList[x])
        }
        for (y in j..last)
            tmp.add(sortList[y])
        for (a in first..last)
            sortList[a] = tmp[a - first]
//        if()

    }
}