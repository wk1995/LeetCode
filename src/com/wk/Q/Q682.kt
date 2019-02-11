package com.wk.Q

import java.util.*

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/02/2019/2/11
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 *
            你现在是棒球比赛记录员。
            给定一个字符串列表，每个字符串可以是以下四种类型之一：
            1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
            2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
            3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
            4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。

            每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
            你需要返回你在所有回合中得分的总和。

        示例 1:

        输入: ["5","2","C","D","+"]
        输出: 30
        解释:
        第1轮：你可以得到5分。总和是：5。
        第2轮：你可以得到2分。总和是：7。
        操作1：第2轮的数据无效。总和是：5。
        第3轮：你可以得到10分（第2轮的数据已被删除）。总数是：15。
        第4轮：你可以得到5 + 10 = 15分。总数是：30。
 *
 * </pre>
 */
class Q682:Q {
    private var count=0
    override fun answer() {
        val ops= arrayOf("5","2","C","D","+")
        println("总分是：  ${calPoints(ops)}")
    }

    private fun calPoints(ops: Array<String>): Int {
        var result=0
        val deque=ArrayDeque<Int>()
        ops.forEach {
            when(it){
                "C"-> {
                    count--
                    deque.removeFirst()
                    println("第 $count 轮 执行的操作'C': 无效")
                    count++
                }
                "D"-> {
                    val card=deque.peekFirst() * 2
                    deque.addFirst(card)
                    println("第 $count 轮 执行的操作'D': $card")
                    count++
                }
                "+"-> {
                   val first=deque.removeFirst()
                    println("栈顶元素： $first")
                    val card=deque.peekFirst()+first
                    println("栈顶前一个元素： ${deque.peekFirst()}")
                    deque.addFirst(first)
                    deque.addFirst(card)
                    println("第 $count 轮 执行的操作'+' : $card")
                    count++
                }
                else->{
                    try {
                        val card=it.toInt()
                        deque.addFirst(card)
                        println("第 $count 轮 : $card")
                        count++
                    }catch (e:NumberFormatException){
                        e.printStackTrace()
                    }

                }
            }
        }
        var tmp=deque.pollFirst()
       while (tmp!=null){

           result+=tmp
           tmp=deque.pollFirst()
       }
        return result
    }
}