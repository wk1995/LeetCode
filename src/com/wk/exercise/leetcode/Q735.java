package com.wk.exercise.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/2/17/22:30
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q735 implements Q {
    @Override
    public void answer() {
        int[] asteroids = {-2,-1,1,2};
        int[] result = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }

    private int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            deal(stack, asteroids[i]);
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] =stack.pop();
        }
        return result;
    }

    private void deal(Stack<Integer> stack, int currentValue) {
        if (stack.isEmpty()) {
            stack.push(currentValue);
            return;
        }
        int topValue = stack.peek();
        //说明是两个不同的数
        if (topValue>0 && currentValue<0) {
            if (topValue + currentValue > 0) {
            } else if (topValue + currentValue < 0) {
                stack.pop();
                deal(stack,currentValue)     ;
            } else {
                stack.pop();
            }
        } else {
            stack.push(currentValue);
        }
    }
}
