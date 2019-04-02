package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/2/10:05
 *      desc   : 不含 AAA 或 BBB 的字符串
 * 给定两个整数 A 和 B，返回任意字符串 S，要求满足：
 *
 * S 的长度为 A + B，且正好包含 A 个 'a' 字母与 B 个 'b' 字母；
 * 子串 'aaa' 没有出现在 S 中；
 * 子串 'bbb' 没有出现在 S 中。
 *
 *
 * 示例 1：
 *
 * 输入：A = 1, B = 2
 * 输出："abb"
 * 解释："abb", "bab" 和 "bba" 都是正确答案。
 * 示例 2：
 *
 * 输入：A = 4, B = 1
 * 输出："aabaa"
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q984 implements Q {
    @Override
    public void answer() {
        int a = 4, b = 1;
        System.out.println(strWithout3a3b(a, b));
    }

    private String strWithout3a3b(int A, int B) {
        if (A >= B)
            return deal1(B, A, 'b', 'a');
        else
            return deal1(A, B, 'a', 'b');
    }

    /**
     * 思路：先abababab的排好，然后多出来的插入
     */
    private String deal1(int small, int big, char b, char a) {
        if (big > small * 2 + 2 || (small == 0 && big == 0))
            return null;
        StringBuilder baseChar = new StringBuilder();
        baseChar.append(a);
        baseChar.append(b);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < small; i++) {
            result.append(baseChar);
        }
        int position = 0;
        for (int j = 0; j < big -  small; j++) {
            if (position >= result.length() - 1)
                result.append(a);
            else
                result.insert(position, a);
            position += 3;

        }
        return result.toString();
    }


    //表示a的个数大于b的个数

    /**
     * 思路：先aabaab的排好，然后多出来的插入
     * 这里关键的是a的个数不一定是2的倍数，这导致了问题的复杂性了
     */
    private String deal(int small, int big, char b, char a) {
        if (big > small * 2 + 2 || (small == 0 && big == 0))
            return null;
        StringBuilder baseChar = new StringBuilder(a);
        baseChar.append(a);
        baseChar.append(b);
        StringBuilder result = new StringBuilder();
        int countSmall = small;
        int countBig = big / 2;
        //说明aa的多，由于一开始就过滤了一些可能，不可能出现aa的个数比b的个数多2个以上
        if (countBig >= countSmall) {
            //aab*countSmall+(big-countBig*2)a
            for (int i = 0; i < countSmall; i++)
                result.append(baseChar);
            for (int j = 0; j < big - countBig * 2 - 1; j++)
                result.append(a);
            return result.toString();
        } else {
            return null;

        }

    }
}
