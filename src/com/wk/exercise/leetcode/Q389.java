package com.wk.exercise.leetcode;

/**
 * <pre>
 *      @@author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/8/28 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address:
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 找不同
 *
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * </pre>
 */
@SuppressWarnings("unused")
public class Q389 implements Q {
    @Override
    public void answer() {
        String s = "abcd";
        String t = "abcde";
        try {
            System.out.println(findTheDifference(s, t));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private char findTheDifference(String s, String t) {
        return findTheDifferenceBySubtraction(s, t);
    }

    /**
     * 异或方法，所有的数来进行异或运算
     * */
    private char findTheDifferenceByXor(String s, String t) {
        char result = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length() - 1; i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        return result;
    }

    /**
     * 把t中所有的字符加起来减去s中所有的字符，得到的数字转为char
     * */
    private char findTheDifferenceBySubtraction(String s, String t) {
        char result = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length() - 1; i++) {
            result -= s.charAt(i);
            result += t.charAt(i);
        }
        return result;
    }
}
