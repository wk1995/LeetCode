package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * @author : wk
 * e-mail : 1226426603@qq.com
 * time   : 2021/5/27
 * desc   : 汉明距离

两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

给出两个整数 x 和 y，计算它们之间的汉明距离。

注意：
0 ≤ x, y < 231.

示例:

输入: x = 1, y = 4

输出: 2

解释:
1   (0 0 0 1)
4   (0 1 0 0)
↑   ↑

上面的箭头指出了对应二进制位不同的位置。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/hamming-distance
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 * address: https://leetcode-cn.com/problems/hamming-distance/
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q461 implements Q{

    @Override
    public void answer() {
        int x=1;
        int y=4;
        System.out.println(hammingDistance(x,y));
    }

    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了8.45%的用户
     * 内存消耗：35.7 MB, 在所有 Java 提交中击败了5.11%的用户
     * */
    private int hammingDistance(int x, int y) {
        int k=x^y;
        int result=0;
        while (k !=0){
            if((k&1)==1){
                ++result;
            }
            k=k>>1;
        }
        return result;
    }
}
