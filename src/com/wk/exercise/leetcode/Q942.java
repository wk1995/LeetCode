package com.wk.exercise.leetcode;

import java.util.Arrays;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address:https://leetcode-cn.com/problems/di-string-match/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   :增减字符串匹配

 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。

 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：

 如果 S[i] == "I"，那么 A[i] < A[i+1]
 如果 S[i] == "D"，那么 A[i] > A[i+1]
  

 示例 1：

 输出："IDID"
 输出：[0,4,1,3,2]
 示例 2：

 输出："III"
 输出：[0,1,2,3]
 示例 3：

 输出："DDI"
 输出：[3,2,0,1]
  

 提示：

 1 <= S.length <= 1000
 S 只包含字符 "I" 或 "D"。

 思路：每次I的前一个位置都是从最小值开始往上加一得到的，每次D的前一个位置都是从最大值开始往下减一得到的

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/di-string-match
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
public class Q942 implements Q {
    @Override
    public void answer() {
        String s="IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    private int[] diStringMatch(String S) {
        if(S==null || S.isEmpty()){
            return null;
        }
        final int size=S.length();
        int start=0;
        int end=size;
        int[] result=new int[size+1];
        for(int i=0;i<size;i++){
           if(S.charAt(i)=='I'){
               result[i]=start;
               start++;
           }else{
               result[i]=end;
               end--;
           }
        }
        result[size]=start;
        return result;
    }
}
