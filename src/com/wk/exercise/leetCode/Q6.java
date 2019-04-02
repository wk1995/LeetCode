package com.wk.exercise.leetCode;


import com.wk.StaticMethod;
import kotlin.Suppress;


/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/17
 *      desc   : Z字形变换
        将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：

         P   A   H   N
         A P L S I I G
         Y   I   R
         之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"

         实现一个将字符串进行指定行数变换的函数:

         string convert(string s, int numRows);
         示例 1:

         输入: s = "PAYPALISHIRING", numRows = 3
         输出: "PAHNAPLSIIGYIR"
         示例 2:

         输入: s = "PAYPALISHIRING", numRows = 4
         输出: "PINALSIGYAHRPI"
         解释:

         P     I    N
         A   L S  I G
         Y A   H R
         P     I
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q6 implements Q{
    @Override
    public void answer() {
        String s="PAYPALISHIRING";
        int numRows=3;
        if(numRows<=1)
            System.out.println(s);
        //一个循环内有多少个字符
        int numLoop=2*numRows-2;
        //字符串里面有多少个循环
        int loopCount=s.length()/numLoop;

        //能成循环的列数
        int loopColumn=(1+numRows-2)*loopCount;

        //未能成为一个循环的字符个数
        int k=s.length()%numLoop;

        int column;
        if(k==0){
            column=loopColumn;

        }else if(k>0 && k<=numRows)
            column=loopColumn+1;
        else
            column=loopColumn+1+(k-numRows);
        Character[][] chars=new Character[numRows][column];

        //表示字符串的指针
        int i=0;
        //表示当前指针列数
        int y1=0;

        while (i<=s.length()-1 && y1<column){

            for(int n=0;n<numRows;n++){
                if(i>s.length()-1) break;
                chars[n][y1]=s.charAt(i);
                i++;
            }
            if(i>s.length()-1) break;
            for(int n1=numRows-2;n1>0;n1--){
                if(i>s.length()-1) return;
                y1++;
                chars[n1][y1]=s.charAt(i);
                i++;
            }
            y1++;

        }

        char[] cs=new char[s.length()];
        StaticMethod.INSTANCE.ergodicTwoDimensionalArray(chars);

        int c=0;
        for(int a=0;a<chars.length;a++){
            for(int b=0;b<chars[a].length;b++){
                if(chars[a][b]!=null) {
                    cs[c]=chars[a][b];
                    c++;
                }
            }
        }
        System.out.println(new String(cs,0,s.length()));

    }




}
