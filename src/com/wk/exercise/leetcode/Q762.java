package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 二进制表示中质数个计算置位
 *
 * 给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
 *
 * （注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）
 *
 * 示例 1:
 *
 * 输入: L = 6, R = 10
 * 输出: 4
 * 解释:
 * 6 -> 110 (2 个计算置位，2 是质数)
 * 7 -> 111 (3 个计算置位，3 是质数)
 * 9 -> 1001 (2 个计算置位，2 是质数)
 * 10-> 1010 (2 个计算置位，2 是质数)
 * 示例 2:
 *
 * 输入: L = 10, R = 15
 * 输出: 5
 * 解释:
 * 10 -> 1010 (2 个计算置位, 2 是质数)
 * 11 -> 1011 (3 个计算置位, 3 是质数)
 * 12 -> 1100 (2 个计算置位, 2 是质数)
 * 13 -> 1101 (3 个计算置位, 3 是质数)
 * 14 -> 1110 (3 个计算置位, 3 是质数)
 * 15 -> 1111 (4 个计算置位, 4 不是质数)
 * 注意:
 *
 * L, R 是 L <= R 且在 [1, 10^6] 中的整数。
 * R - L 的最大值为 10000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q762 implements Q {
    @Override
    public void answer() {
        System.out.println(countPrimeSetBits(6, 10));
    }

    /**
     * 执行用时 :34 ms, 在所有 Java 提交中击败了42.61%的用户
     * 内存消耗 :33.5 MB, 在所有 Java 提交中击败了72.06%的用户
     * 提示很重要
     */
    private int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            int count = getCount(i);
            System.out.println("" + i + " 的计算置位个数： " + count);
            if (isPrimeNumber(count)) {
                System.out.println("" + count + " 是质数： ");
                result++;
            }
        }
        return result;
    }

    /**
     * 是否是质数
     */
    private boolean isPrimeNumber(int number) {
        int three = 3;
        int two = 2;
        if (number <= 1) {
            return false;
        }
        if (number <= three) {
            return true;
        }
        for (int i = 2; i <= number / two; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return 计算置位的个数
     */
    private int getCount(int number) {
        int result = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                result++;
            }
            number >>= 1;
        }
        return result;
    }
}
