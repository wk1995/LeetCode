package com.wk

import com.wk.data.structure.TreeNode

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/17
 *      desc   : 静态方法
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
     fun <T> ergodicTwoDimensionalArray(a: Array<Array<T>>) {
        for (i in a.indices) {
            for (j in 0 until a[i].size )
                print(a[i][j].toString() + ",")
            println()
        }
    }

    //前序
    fun ergodicTreeForwardOrder(treeNode : TreeNode){

    }

    //中序
    fun ergodicTreeMediumOrder (treeNode : TreeNode){

    }
    //后序
    fun ergodicTreeBehindOrder (treeNode : TreeNode){

    }
}