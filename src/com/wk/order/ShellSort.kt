package com.wk.order

import com.wk.StaticMethod

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/15/9:57
 *      desc   : 希尔排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@Suppress(StaticMethod.UNUSED)
class ShellSort<T : Comparable<T>> : Sort<T>() {

    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        return sortList
    }
}