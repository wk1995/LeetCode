package com.wk

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/17
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
object StaticMethod {

    /**
     * 遍历List
     * */
     fun ergodicList(list: List<*>) {
        if (list.isEmpty()) {
            println("无数据")
        }
        val iterable = list.iterator()
        while (iterable.hasNext()) {
            println(iterable.next())
        }

    }

    /**
     * 遍历二维数组
     * */
     fun ergodicTwoDimensionalArray(a: Array<IntArray>) {
        for (i in a.indices) {
            for (j in 0 until a[i].size - 1)
                print(a[i][j].toString() + ",")
            println()
        }
    }
}