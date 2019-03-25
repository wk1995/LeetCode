package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/2/28/22:36
 *      desc   : 删列造序
             给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。

             选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。

             比如，有 A = ["abcdef", "uvwxyz"]，删除索引序列 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A 的列分别为["b","v"], ["e","y"], ["f","z"]。（形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。

             假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。

             示例 1：

             输入：["cba", "daf", "ghi"]
             输出：1
             解释：
             当选择 D = {1}，删除后 A 的列为：["c","d","g"] 和 ["a","f","i"]，均为非降序排列。
             若选择 D = {}，那么 A 的列 ["b","a","h"] 就不是非降序排列了。
             示例 2：

             输入：["a", "b"]
             输出：0
             解释：D = {}
             示例 3：

             输入：["zyx", "wvu", "tsr"]
             输出：3
             解释：D = {0, 1, 2}
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q944 implements Q {
    @Override
    public void answer() {
        String[] A={"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(A));

    }
    public int minDeletionSize(String[] A) {
        int size=A.length;
        int length=A[0].length();
        int result=length;
        outterLoop: for (int i=0;i<length;i++){
            for(int j=0;j<size-1;j++){
                //检查是否降序
                if(A[j].charAt(i)>A[j+1].charAt(i)) {
                    result -= 1;
                    continue outterLoop;
                }
            }
        }
        return length-result;
    }


}
