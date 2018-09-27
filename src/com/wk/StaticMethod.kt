package com.wk

import com.wk.data.structure.ListNode
import com.wk.data.structure.NaturalTree

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
    fun <T> ergodicList(list: List<T>):String {
        if (list.isEmpty()) {
            return ("无数据")
        }
        val sb=StringBuilder()
        sb.append("[\r\n")
        val iterable = list.iterator()
        while (iterable.hasNext()) {
            val t = iterable.next()
            if (t is List<*>)
                sb.append(ergodicList(t))
            else
                sb.append("$t ,")
        }
        sb.append("]\r\n")
        return sb.toString()
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
    const val ForwardOrder = 0
    //后序
    const val PostOrder = -1

    /**
     * 遍历N叉树
     * @param  naturalTree需要遍历的N叉树
     * @param  order 遍历的方式，ForwardOrder表示前序遍历，PostOrder表示后序遍历
     * @return 返回StringBuilder 如需返回List{@see link @589}
     * @see link Q589/Q590
     * */
    fun ergodicNaturalTreeOrder(naturalTree: NaturalTree?, order: Int = ForwardOrder): StringBuilder {
        if (naturalTree?.children?.size ?: -2 < order)
            return ergodicNaturalTreeOrder(naturalTree, PostOrder)

        val result = StringBuilder()
        if (naturalTree == null) {
            return result
        } else {
            val children = naturalTree.children
            if (children == null || children.isEmpty()) {
                result.append("${naturalTree.`val`}->")
                return result
            }
            var i = 0
            var hasForward = false
            while (i < children.size) {
                if (i == order && !hasForward) {
                    result.append("${naturalTree.`val`}->")
                    hasForward = true
                    continue
                }
                result.append(ergodicNaturalTreeOrder(children[i]))
                i++
            }
            if (order == PostOrder)
                result.append("${naturalTree.`val`}->")
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