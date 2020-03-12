package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/3/12 <br/>
 *      desc   : 字符串的最大公因子         <br/>

对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。

返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。

 

示例 1：

输入：str1 = "ABCABC", str2 = "ABC"
输出："ABC"
示例 2：

输入：str1 = "ABABAB", str2 = "ABAB"
输出："AB"
示例 3：

输入：str1 = "LEET", str2 = "CODE"
输出：""
 

提示：

1 <= str1.length <= 1000
1 <= str2.length <= 1000
str1[i] 和 str2[i] 为大写英文字母

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/greatest-common-divisor-of-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q1071 implements Q {

    @Override
    public void answer() {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX", str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1,str2));
    }

    private String gcdOfStrings(String str1, String str2) {
        String result="";
        int str2Length=str2.length();
        int str1Length=str1.length();
        if(str2Length>str1Length){
            return gcdOfStrings(str2,str1);
        }
        for (int i=0;i<str2Length;i++){
            String target=str2.substring(0,i+1);
            if(canDivideUp(target,str1 ) && canDivideUp(target,str2 )&& target.length()>result.length()){
                result=target;
            }
        }
        return result;
    }

    /**
     * @param divisor 除数
     * @param  dividend 被除数
     * */
    private boolean canDivideUp(String divisor,String dividend ){
        if(divisor==null || dividend==null){
            return false;
        }
        int divisorLength=divisor.length();
        int dividendLength=dividend.length();
        if(divisorLength>dividendLength || dividendLength%divisorLength!=0){
            return false;
        }
        for (int  i=0;i<dividendLength;i++){
            int index=i%divisorLength;
            if(dividend.charAt(i)!=divisor.charAt(index)){
                return false;
            }
        }
        return true;
    }
}
