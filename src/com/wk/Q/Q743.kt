package com.wk.Q

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/12/9/21:16
 *      desc   : 743. 网络延迟时间

        有 N 个网络节点，标记为 1 到 N。

        给定一个列表 times，表示信号经过有向边的传递时间。 times[i] = (u, v, w)，其中 u 是源节点，v 是目标节点， w 是一个信号从源节点传递到目标节点的时间。

        现在，我们向当前的节点 K 发送了一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1。

        注意:

        N 的范围在 [1, 100] 之间。
        K 的范围在 [1, N] 之间。
        times 的长度在 [1, 6000] 之间。
        所有的边 times[i] = (u, v, w) 都有 1 <= u, v <= N 且 1 <= w <= 100。

 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q743 : Q {
    override fun answer() {

    }

    private fun networkDelayTime(times: Array<IntArray>, N: Int, K: Int): Int {
        val hash = HashMap<Int, Int>()
        times.forEach {
            if (it[0] == K) {
                val value = hash[it[1]]
                if (value == null || value > it[2])
                    hash[it[1]] = it[2]
            }
        }
        return 0
    }
}