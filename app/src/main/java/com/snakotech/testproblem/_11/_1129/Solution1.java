package com.snakotech.testproblem._11._1129;

import java.util.Stack;

/**
 * 思路：压栈时把最小值放到最小栈（存储最小值）的栈顶
 * Created by Administrator on 2017/12/1.
 */

public class Solution1 {

        private Stack<Integer> valueStack = new Stack<>();


        private Stack<Integer> minStack = new Stack<>();

        public void push(int node) {
            valueStack.push(node);
            if (minStack.isEmpty()) {
                minStack.push(node);
            } else {
                minStack.push(node < minStack.peek() ? node : minStack.peek());
            }
        }

        public void pop() {
            if (!valueStack.isEmpty()) {
                valueStack.pop();
                minStack.pop();
            }
        }

        public int top() {
            return valueStack.peek();
        }

        public int min() {
            return minStack.peek();
        }

}
