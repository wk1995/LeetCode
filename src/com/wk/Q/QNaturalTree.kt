package com.wk.Q

import com.wk.StaticMethod
import com.wk.data.structure.NaturalTree
import java.util.ArrayList

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/19/7:40
 *      desc   : 关于N叉树的题目
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
abstract class QNaturalTree : Q {
    protected lateinit var naturalTreeRoot : NaturalTree
    init {
        val naturalTree3Left = NaturalTree(5, null)
        val naturalTree3Right = NaturalTree(6, null)
        val childer21 = ArrayList<NaturalTree>()
        childer21.add(naturalTree3Left)
        childer21.add(naturalTree3Right)
        val naturalTree21 = NaturalTree(3, childer21)
        val naturalTree22 = NaturalTree(2, null)
        val naturalTree23 = NaturalTree(4, null)
        val childer1 = ArrayList<NaturalTree>()
        childer1.add(naturalTree21)
        childer1.add(naturalTree22)
        childer1.add(naturalTree23)
        naturalTreeRoot = NaturalTree(1, childer1)
    }

    protected fun ergodic(root: NaturalTree?, order: Int): List<Int> {
        if (root?.children?.size?:-2<order)
            return ergodic(root, StaticMethod.PostOrder)
        val nodeList = ArrayList<Int>()
        if (root == null) return nodeList
        val childer = root.children
        if (childer == null || childer.isEmpty()) {
            nodeList.add(root.`val`)
            return nodeList
        }
        var hasOrder = false
        var i = 0
        while (i < childer.size) {
            if (i == order && !hasOrder) {
                nodeList.add(root.`val`)
                hasOrder = true
                continue
            }
            nodeList.addAll(ergodic(childer[i], StaticMethod.ForwardOrder))
            i++
        }
        if(order== StaticMethod.PostOrder)
            nodeList.add(root.`val`)
        return nodeList
    }

}