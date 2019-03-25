package com.wk.order

import com.wk.StaticMethod

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/1/27/21:26
 *      desc   : 插入排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(StaticMethod.UNUSED)
class InsertSort<T : Comparable<T>> : Sort<T>() {
    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        val size = sortList.size
        //正在排序的T
//        var current: T
        for (i in 0 until size) {
            var preIndex:Int = i - 1
            val current = sortList[i]
           while(preIndex>=0 && current<sortList[preIndex]){
               sortList[i]=sortList[preIndex]
               preIndex--
           }
            sortList[preIndex+1]=current
        }
        return sortList
    }
}