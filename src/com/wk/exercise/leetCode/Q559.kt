package com.wk.exercise.leetCode

import com.wk.data.structure.NaturalTree

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/19/7:52
 *      desc   : N叉树的最大深度
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q559:QNaturalTree(){

    override fun answer() {
        println(maxDepth(naturalTreeRoot))
    }

    private fun maxDepth(root: NaturalTree?): Int {

        if (root == null) return 0
        val childer = root.children

        if (childer == null || childer.isEmpty()) {
            return 0
        }
        var childMaxDepth=0
        childer.forEach {
            childMaxDepth=Math.max(maxDepth(it),childMaxDepth)
        }
        return 1+childMaxDepth
    }
}