package com.wk.exercise.leetcode

import com.wk.SuppressConstant


/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 最长特殊序列 Ⅰ

给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。最长特殊序列定义如下：
    该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。

    子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。
    空序列为所有字符串的子序列，任何字符串为其自身的子序列。

    输入为两个字符串，输出最长特殊序列的长度。如果不存在，则返回 -1。

示例 :

输入: "aba", "cdc"
输出: 3
解析: 最长特殊序列可为 "aba" (或 "cdc")
说明:

两个字符串长度均小于100。
字符串中的字符仅含有 'a'~'z'。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-uncommon-subsequence-i
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
@Suppress(SuppressConstant.UNUSED)
class Q521:Q {
    override fun answer() {
        val a="abc"
        val b="bca"
        println(findLUSlength(a,b))
    }
    private fun findLUSlength(a: String, b: String): Int {
        return if(a==b){
            -1
        }else{
            a.length.coerceAtLeast(b.length)
        }
    }
}