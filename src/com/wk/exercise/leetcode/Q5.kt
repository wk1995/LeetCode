package com.wk.exercise.leetcode

import com.wk.StaticMethod
import com.wk.SuppressConstant

/**
 * <pre>
 * @author : wk
 * e-mail : 1226426603@qq.com
 * time   : 2018/07/17
 * desc   : 最长回文子串
 *          给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 *          "babad":"bab" or "aba"
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
</pre> *
 */
@Suppress(SuppressConstant.UNUSED)
class Q5 : Q {
    override fun answer() {
        val s = "babad"
        if (s.length < 2)
            println(s)
        var maxLengthString = ""

        for (i in 0 until s.length - 1 - 1) {
            maxLengthString = comparePalindrome(s, i, i, maxLengthString)
            maxLengthString = comparePalindrome(s, i, i + 1, maxLengthString)

        }
        println(maxLengthString)
    }

    private fun comparePalindrome(cs: String, left: Int, right: Int, string: String): String {
        var left = left
        var right = right
        while (left >= 0 && right <= cs.length - 1
                && cs[left] == cs[right]) {
            left--
            right++
        }
        /**
         * 这里right-left-1的意思是right-left-2+1,
         * 当最后一个符合条件的时候左右俩指针还会继续向两边移动，无形之中增加了2
         * */
        return if (string.length < right - left - 1)
            cs.substring(left + 1, right)
        else
            string

    }
}
