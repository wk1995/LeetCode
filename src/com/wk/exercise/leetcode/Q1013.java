package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/3/11 <br/>
 *      desc   :  将数组分成和相等的三个部分        <br/>

给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。

形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。

 

示例 1：

输出：[0,2,1,-6,6,-7,9,1,2,0,1]
输出：true
解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
示例 2：

输入：[0,2,1,-6,6,7,9,-1,2,0,1]
输出：false
示例 3：

输入：[3,3,6,5,-2,2,5,1,-9,4]
输出：true
解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 

提示：

3 <= A.length <= 50000
-10^4 <= A[i] <= 10^4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 *      address: https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q1013 implements Q {
    @Override
    public void answer() {
        int[] a={1,-1,1,-1};
        System.out.println(canThreePartsEqualSum(a));
    }
    private boolean canThreePartsEqualSum(int[] a) {
        int targetNum=3;
        if(a==null){
            return false;
        }
        int length=a.length;
        if(length<targetNum){
            return false;
        }
        int sum=0;
        for(int index:a){
            sum+=index;
        }
        if(sum % targetNum!=0){
            return false;
        }
        int ave=sum/targetNum;

        int firstSum=0;
        int secondSum=0;

        for(int i=0;i<a.length;i++){
            if(firstSum==ave && i!=0){
                secondSum+=a[i];
                if(secondSum==ave){
                    return i!=a.length-1;
                }
            }else {
                firstSum += a[i];
            }

        }
        return false;
    }
}
