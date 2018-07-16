package com.wk;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(q5());
    }

    /**
     *  最长回文子串
     *  给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
     *  "babad":"bab" or "aba"
     * */
    private static String q5(){
        String s="babad";
        if(s.length()<2)
            return s;
        char[] cs=s.toCharArray();
        String maxLengthString="";
        for(int i=0;i<s.length()-1;i++){
            maxLengthString=comparePalindrome(s,i,i,maxLengthString);
            maxLengthString=comparePalindrome(s,i,i+1,maxLengthString);

        }
        return maxLengthString;
    }
    private static String comparePalindrome(String cs,int left,int right,String string){
        while(left>=0 && right<=cs.length()-1
                && cs.charAt(left) == cs.charAt(right)){
            left--;
            right++;
        }
        if(string.length()<right-left-1)
            return cs.substring(left+1,right);
        else
            return string;

    }


}
