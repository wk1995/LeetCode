package com.wk.Q;

import com.wk.StaticMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/17
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q728 implements Q {
    @Override
    public void answer() {
        int left=1;
        int right=22;
        List<Integer> list=new ArrayList();
        for(int i=left;i<=right;i++){
            if(way(i))
                list.add(i);
        }
        System.out.println(StaticMethod.INSTANCE.ergodicList(list));

    }
    private  boolean way(int j){
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
}
