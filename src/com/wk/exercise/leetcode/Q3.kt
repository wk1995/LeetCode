package com.wk.exercise.leetcode

import com.wk.SuppressConstant

/**
 * <pre>
 *      @author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/3/26
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 无重复字符的最长子串
 *
        给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:

        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:

        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

 * </pre>
 */

@Suppress(SuppressConstant.UNUSED)
class Q3:Q {
    override fun answer() {
        val s="bbbbb"
        println(lengthOfLongestSubstring(s))
    }

    private fun lengthOfLongestSubstring(s: String): Int {
        var result=0
        val m = IntArray(256)
        var i=0
        s.toCharArray().forEach {
            //m[it.toInt()]表示it的上一个位置
            result=Math.max(result,m[it.toInt()])
            result=i-result+1
            i++
            m[it.toInt()]=i
        }
        return result
    }
}