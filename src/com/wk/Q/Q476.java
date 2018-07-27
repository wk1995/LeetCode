package com.wk.Q;

public class Q476  implements Q  {
    @Override
    public void answer() {
        int num=5;
        String mBinaryString=Integer.toBinaryString(num);
        char[] cc=mBinaryString.toCharArray();
        for(int j=0;j<=cc.length-1;j++){
            if(cc[j]=='1')
                cc[j]='0';
            else
                cc[j]='1';

        }
        System.out.println(Integer.valueOf(new String(cc),2));
    }
}
