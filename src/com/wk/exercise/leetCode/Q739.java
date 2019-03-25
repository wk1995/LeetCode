package com.wk.exercise.leetCode;

import java.util.Arrays;
import java.util.Stack;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/2/16/16:18
 *      desc   : 每日温度
 *
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请输入 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。
 *
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q739 implements Q {
    @Override
    public void answer() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }

    private int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int size = t.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++)
            delay(stack, i, result, t);
        return result;
    }

    private void delay(Stack<Integer> stack, int i, int[] result, int[] t) {
        if (stack.isEmpty()) {
            stack.push(i);
            return;
        }
        int top = stack.peek();
        //碰到大于栈顶元素的时候
        if (t[top] < t[i]) {
            result[top] = i - top;
            stack.pop();
            delay(stack,i,result,t);
        } else{
            stack.push(i);
        }

    }

}
