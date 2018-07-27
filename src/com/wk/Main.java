package com.wk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
       solve(6);
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
