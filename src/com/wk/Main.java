package com.wk;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
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

    private static List<Integer> q728(){
        int left=1;
        int right=22;
        List<Integer> list=new ArrayList();
        for(int i=left;i<=right;i++){
            if(way(i))
                list.add(i);
        }
        ergodicList(list);
        return list;
    }
    private static boolean way(int j){
        int i=j;
        int a;
        while(i!=0){
            a=i%10;

            if(a==0 || j%a!=0)
                return false;
            i/=10;
        }
        return true;
    }




    private static int[][] q832(){
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<A.length;i++){
            swapArray(A[i]);
        }

        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j] + ",");
            System.out.println();
        }

        for(int i=0;i<A.length;i++)
            for(int j=0;j<A[i].length;j++)
                A[i][j]=A[i][j]^1;
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j] + ",");
            System.out.println();
        }
        return A;
    }
    private static void swapArray(int[] a){
        for(int j=0;j<=a.length/2-1;j++){
            a[j]=a[j]^a[a.length-1-j];
            a[a.length-1-j]=a[j]^a[a.length-1-j];
            a[j]=a[j]^a[a.length-1-j];
        }

    }


    private static int  q852(){
        int[] A={0,1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,0};
        for(int i=1;i<A.length-1;i++){
            if(isMaxInLeft(A,i) && isMaxInRight(A,i))
                return i;
        }
        return -1;
    }
    private static boolean isMaxInLeft(int[] a,int i){
        while (i>0){
            if(a[i]<=a[i-1])
                return false;
            i--;
        }
        return true;
    }
    private static boolean isMaxInRight(int[] a,int i){
        while (i<a.length-1){
            if(a[i]<=a[i+1])
                return false;
            i++;
        }
        return true;
    }


    private static void ergodicList(List list){
        if(list.isEmpty()){
            System.out.println("无数据");
        }
        Iterator iterable=list.iterator();
        while (iterable.hasNext())
        {
            System.out.println(iterable.next());
        }

    }

}
