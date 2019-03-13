package com.wk.order

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/12/5/23:19
 *      desc   : 排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
abstract class Sort<T : Comparable<T>> {
    //降序
    abstract fun descSort(sortList: ArrayList<T>):ArrayList<T>
    //升序
    abstract fun ascSort(sortList: ArrayList<T>):ArrayList<T>

}