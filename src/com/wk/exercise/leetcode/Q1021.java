package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/remove-outermost-parentheses/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 删除最外层的括号
 *
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 *
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * 示例 2：
 *
 * 输入："(()())(())(()(()))"
 * 输出："()()()()(())"
 * 解释：
 * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 * 删除每隔部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 * 示例 3：
 *
 * 输入："()()"
 * 输出：""
 * 解释：
 * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 * 删除每个部分中的最外层括号后得到 "" + "" = ""。
 *  
 *
 * 提示：
 *
 * S.length <= 10000
 * S[i] 为 "(" 或 ")"
 * S 是一个有效括号字符串
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q1021 implements Q {
    @Override
    public void answer() {
        String s ="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    private String removeOuterParentheses(String s) {
        if (s == null || "".equals(s)) {
            return "";
        }
        int length = s.length();
        //单独'('个数
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char currentChar=s.charAt(i);
            if (currentChar == '(') {
                if (count > 0) {
                    sb.append(currentChar);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    sb.append(currentChar);
                }
            }
        }

        return sb.toString();
    }
}
