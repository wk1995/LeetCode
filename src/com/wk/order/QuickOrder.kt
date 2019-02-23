package com.wk.order

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/12/8/14:43
 *      desc   : 快速排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class QuickOrder : Order() {

    override fun <T : Comparable<Any>> descOrder(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Comparable<Any>> ascOrder(sortList: ArrayList<T>): ArrayList<T> {
        if (sortList.size <= 1)
            return sortList
        val result = ArrayList<T>()
        val taget = sortList[0]
        val left = ArrayList<T>()
        val right = ArrayList<T>()
        for (i in 1 until sortList.size) {
            val it = sortList[i]
            if (it > taget)
                right.add(it)
            else
                left.add(it)
        }
        result.addAll(ascOrder(left))
        result.add(taget)
        result.addAll(ascOrder(right))
        return result
    }
}