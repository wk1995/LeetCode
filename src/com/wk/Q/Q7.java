package com.wk.Q;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/28
 *      desc   :
 *      反转整数
 *
 *      给定一个 32 位有符号整数，将整数中的数字进行反转。

         示例 1:

         输入: 123
         输出: 321
         示例 2:

         输入: -123
         输出: -321
         示例 3:

         输入: 120
         输出: 21
         注意:

         假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  (2^31) − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。


 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q7 implements  Q{

    @Override
    public void answer() {
        int x=1534236469;
        boolean negative=false;
        char[] cs=String.valueOf(x).toCharArray();
        if(cs.length==1)
        {
            System.out.println(x);
            return;
        }
        if(cs[0]=='-')
            negative=true;
        for(int i=0,j=cs.length-1;i<j;i++,j--){
            char tmp=cs[i];
            cs[i]=cs[j];
            cs[j]=tmp;
        }
        try {
            Integer result = Integer.valueOf(checkChars(cs));
            if (negative)
                result = 0 - result;
            if (result < Math.pow(-2.0, 31) || result > (Math.pow(2.0, 31) - 1))
                result = 0;

            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println(0);
        }
    }

    private String checkChars(char[] cs){
        int i=0;//检测开头的是否为0
        int j=cs.length;//检测末尾是否是负号/正号
        while (cs[i]=='0'){
            i++;
        }
        while(cs[j-1]<'0'){
            j--;
        }
        return new String(cs,i,j-i);

    }
}
