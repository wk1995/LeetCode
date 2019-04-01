package com.wk.Q

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/3/14:47
 *      desc   :  模拟行走机器人
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q874 :Q {
    override fun answer() {
        val commands=intArrayOf(4,-1,3)
        val obstacles=arrayOf(intArrayOf())
        println(robotSim(commands,obstacles))
    }

    private fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {
        var x=0
        var y=0
        return x*x+y*y
    }
}