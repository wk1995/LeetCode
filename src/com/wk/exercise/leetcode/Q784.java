package com.wk.exercise.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/8/28 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address:
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 字母大小写全排列
 *
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 *
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：
 *
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-case-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
//todo
public class Q784 implements Q {
    @Override
    public void answer() {

    }

    private List<String> letterCasePermutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        result.add(S);
        ArrayList<Integer> positions = new ArrayList<>();
        for (int index = 0; index < S.length(); index++) {
            if (isLetter(S.charAt(index))) {
                positions.add(index);
            }
        }
        if (positions.isEmpty()) {
            return result;
        }
        char[] cs=S.toCharArray();

        return null;
    }

    /**是否是字母*/
    private boolean isLetter(char target) {
        int aChar = 'a';
        int zChar = 'Z';
        return (target >= zChar && target <= aChar);
    }

    /**小写字母转换为大写字母*/
    private char changeUpLetter(char target) {
        int aChar = 'a';
        int zChar = 'z';
        int upCharA = 'A';
        //先判断是否是小写字母
        if (target >= aChar && target <= zChar) {
           int dLetterValue=upCharA-aChar;
           return (char)(dLetterValue+target);
        } else {
            return target;
        }
    }
}
