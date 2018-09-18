package com.wk

import com.wk.data.structure.ListNode
import com.wk.data.structure.NaturalTree
import com.wk.data.structure.TwoForkTree

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
            for (j in 0 until a[i].size)
                print(a[i][j].toString() + ",")
            println()
        }
    }

    //前序
    const val ForwardOrder=0
    //遍历N叉树
    fun ergodicNaturalTreeOrder(naturalTree: NaturalTree?,order:Int=ForwardOrder): StringBuilder {
        if (naturalTree?.children?.size?:-1<order)
            return ergodicNaturalTreeOrder(naturalTree)

        val result = StringBuilder()
        if (naturalTree == null) {
            return result
        } else {
            val children=naturalTree.children
            if(children==null ||children.isEmpty()) {
                result.append("${naturalTree.`val`}->")
                return result
            }
            var i=0
            var hasForward=false
            while (i<children.size){
                if(i==order && !hasForward) {
                    result.append("${naturalTree.`val`}->")
                    hasForward=true
                    continue
                }
                result.append(ergodicNaturalTreeOrder(children[i]))
                i++
            }

        }
        return result
    }

    //遍历单链表
    fun ergodicListNode(listNode: ListNode?): String? {
        if (listNode == null) return null
        val result = StringBuilder()
        result.append("${listNode.`val`}->")
        result.append(ergodicListNode(listNode.next) ?: "")

        return result.toString()
    }
}