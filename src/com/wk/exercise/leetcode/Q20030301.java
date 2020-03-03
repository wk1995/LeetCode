package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.Arrays;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/3/3 <br/>
 *      desc   :  面试题 10.01. 合并排序的数组        <br/>
 *
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 *
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 *
 * 示例:
 *
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sorted-merge-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *      address: https://leetcode-cn.com/problems/sorted-merge-lcci/
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q20030301 implements Q {

    @Override
    public void answer() {
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] B = {2, 5, 6};
        merge(A, 3, B, 3);
        System.out.println(Arrays.toString(A));
    }

    private void merge(int[] A, int m, int[] B, int n) {
        int[] newA = new int[m];
        for (int i = 0; i < m; i++) {
            newA[i] = A[i];
        }
        int a = 0;
        int b = 0;
        int j = 0;
        while (a < m && b < n) {
            if (newA[a] <= B[b]) {
                A[j] = newA[a];
                j++;
                a++;
            } else {
                A[j] = B[b];
                j++;
                b++;
            }
        }
        while (a < m) {
            A[j] = newA[a];
            j++;
            a++;
        }
        while (b < n) {
            A[j] = B[b];
            j++;
            b++;
        }
    }
}
