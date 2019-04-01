package com.wk;

import com.wk.order.HeapSort;
import com.wk.order.InsertSort;
import com.wk.order.MergeOrder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       solve(841);
//        order();
    }

    private static void order(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        StaticMethod.INSTANCE.ergodicList(new HeapSort<Integer>().ascSort(list));
    }

    private static void solve(int i){
        String s="com.wk.Q.Q"+i;
        try {
            Class c = Class.forName(s);
            Method m=c.getMethod("answer",new  Class[ 0 ]);
            Object o=c.newInstance();
            m.invoke(o, new  Object[]{});
        }catch (ClassNotFoundException e){
            System.out.println("没有Q"+i+"的答案");

        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
