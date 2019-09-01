package com.wk;

import com.wk.exercise.ExerciseType;
import com.wk.order.BubbleSort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import static com.wk.exercise.ExerciseType.LEET_CODE;

public class Main {



    public static void main(String[] args) {
       solve(938,LEET_CODE);
//        sort();
    }

    private static  void sort(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(Arrays.toString((new BubbleSort<Integer>().ascSort(list)).toArray()));
    }

    private static void solve(int i,ExerciseType type){
        String className="com.wk.exercise."+type.getName()+".Q"+i;
        try {
            Class c = Class.forName(className);
            Method m=c.getMethod("answer",new  Class[ 0 ]);
            Object o=c.newInstance();
            m.invoke(o, new  Object[]{});
        }catch (ClassNotFoundException e){
            System.out.println("没有"+type.getName()+" Q"+i+"的答案");

        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            System.out.println(type.getName()+i+" 没有answer方法");
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
