package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.Stack;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/02/2019/2/11
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 用栈实现队列

             使用栈实现队列的下列操作：

             push(x) -- 将一个元素放入队列的尾部。
             pop() -- 从队列首部移除元素。
             peek() -- 返回队列首部的元素。
             empty() -- 返回队列是否为空。
             示例:

             MyQueue queue = new MyQueue();

             queue.push(1);
             queue.push(2);
             queue.peek();  // 返回 1
             queue.pop();   // 返回 1
             queue.empty(); // 返回 false


 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q232 implements Q {
    @Override
    public void answer() {
     MyQueue obj = new MyQueue();
      obj.push(1);
      obj.push(2);
        int param_3 = obj.peek();
      int param_2 = obj.pop();
     boolean param_4 = obj.empty();
     System.out.println("param_2: "+param_2+" param_3: "+param_3+"   param_4:  "+param_4);
    }
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    class MyQueue {
        private Stack<Integer> push;
        private Stack<Integer> pull;
        /** Initialize your data structure here. */
        public MyQueue() {
            push=new Stack<>();
            pull=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            push.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (!push.isEmpty()){
                pull.push(push.pop());
            }
            int result= pull.pop();
            while (!pull.isEmpty()){
                push.push(pull.pop());
            }
            return result;
        }

        /** Get the front element. */
        public int peek() {
            while (!push.isEmpty()){
                pull.push(pull.pop());
            }
            int result= pull.peek();
            while (!pull.isEmpty()){
                push.push(pull.pop());
            }
            return result;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return push.isEmpty();
        }
    }
}
