package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.HashMap;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 重复 N 次的元素

 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。

 返回重复了 N 次的那个元素。

  

 示例 1：

 输入：[1,2,3,3]
 输出：3
 示例 2：

 输入：[2,1,2,5,3,2]
 输出：2
 示例 3：

 输入：[5,1,5,2,5,3,5,4]
 输出：5
  

 提示：

 4 <= A.length <= 10000
 0 <= A[i] < 10000
 A.length 为偶数

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q961 implements Q {
    @Override
    public void answer() {
        int[] a={1,2,3,3};
        System.out.println(repeatedNTimes(a));
    }
    private int repeatedNTimes(int[] A){
        HashMap<Integer,Integer> repeatedCheck=new HashMap<>(A.length);
        for(int a:A){
            if(repeatedCheck.get(a)!=null){
                return a;
            }else {
                repeatedCheck.put(a,a);
            }

        }
     return Integer.MIN_VALUE;
    }
}
