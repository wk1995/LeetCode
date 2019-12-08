package com.wk;

import com.wk.exercise.ExerciseType;
import com.wk.order.BubbleSort;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.wk.exercise.ExerciseType.LEET_CODE;

/**
 * @author wangkang
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入题目序号： ");
        Scanner scanner=new Scanner(System.in);
        int questionIndex=scanner.nextInt();
       solve(questionIndex,LEET_CODE);
//        sort();
       /* Integer[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        TwoForkTree twoForkTree= TwoForkTree.createTwoForkTree(nums,STRATUM_LEFT_TO_RIGHT,0);
        twoForkTree.showTwoForkTree();*/
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
            Class<?> c = Class.forName(className);
            Method m=c.getMethod("answer");
            Object o=c.newInstance();
            m.invoke(o);
        }catch (ClassNotFoundException e){
            System.out.println("没有"+type.getName()+" Q"+i+"的答案");

        } catch (NoSuchMethodException e){
            System.out.println(type.getName()+i+" 没有answer方法");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
