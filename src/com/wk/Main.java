package com.wk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
       solve(728);
    }

    private static void solve(int i){
        String s="com.wk.Q.Q"+i;
        try {
            Class c = Class.forName(s);
            Method m=c.getMethod("answer",null);
            Object o=c.newInstance();
            m.invoke(o,null);
        }catch (ClassNotFoundException e){
            System.out.println("没有Q"+i+"的答案");

        }catch (NoSuchMethodException e){

        }catch (IllegalAccessException e){

        }catch (InstantiationException e){

        }catch (InvocationTargetException e){

        }
    }

}
