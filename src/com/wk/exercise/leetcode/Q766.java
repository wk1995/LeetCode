package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.HashSet;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/toeplitz-matrix/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 托普利茨矩阵
 *
 * 如果一个矩阵的每一方向由左上到右下的对角线上都是相同元素，那么这个矩阵是托普利茨矩阵。
 *
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例 1:
 *
 * 输入:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * 输出: True
 * 解释:
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是True。
 * 示例 2:
 *
 * 输入:
 * matrix = [
 *   [1,2],
 *   [2,2]
 * ]
 * 输出: False
 * 解释:
 * 对角线"[1, 2]"上的元素不同。
 * 说明:
 *
 *  matrix 是一个包含整数的二维数组。
 * matrix 的行数和列数均在 [1, 20]范围内。
 * matrix[i][j] 包含的整数在 [0, 99]范围内。
 * 进阶:
 *
 * 如果矩阵存储在磁盘上，并且磁盘内存是有限的，因此一次最多只能将一行矩阵加载到内存中，该怎么办？
 * 如果矩阵太大以至于只能一次将部分行加载到内存中，该怎么办？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/toeplitz-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q766 implements Q {
    @Override
    public void answer() {
        int[][] matrix =   {
                            {58,25,63},
                            {30,0,25},
                            {90,30,58}}
                            ;
        System.out.println(isToeplitzMatrix(matrix));
    }

    private boolean isToeplitzMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                if (r > 0 && c > 0 && matrix[r - 1][c - 1] != matrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isToeplitzMatrix1(int[][] matrix) {
        if (matrix == null) {
            return true;
        }
        int length = matrix.length;
        if (length == 0) {
            return true;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        int number = matrix[0].length;
        //行数
        for (int k = 0;k<length ; k++) {
            boolean result=false;
            hashSet.clear();
            int i=k;
            int j = 0;
            //说明该位置对角线就只有一个数
            if(j+1>=number || i+1>=length){
                continue;
            }
            while (j < number && i < length) {
                System.out.print(matrix[i][j]);
                if (hashSet.contains(matrix[i][j])) {
                    result=true;
                    break;
                } else {
                    hashSet.add(matrix[i][j]);
                }
                i++;
                j++;
            }
            System.out.println();
            if(!result){
                return false;
            }
        }

        for (int k = 0;k<number ; k++) {
            boolean result=false;
            hashSet.clear();
            int i=k;
            int j = 0;
            //说明该位置对角线就只有一个数
            if(j+1>=length || i+1>=number){
                continue;
            }
            while (j < length && i < number) {
                if (hashSet.contains(matrix[j][i])) {
                    result=true;
                    break;
                } else {
                    hashSet.add(matrix[j][i]);
                }
                i++;
                j++;
            }
            if(!result){
                return false;
            }
        }
        return true;
    }

}
