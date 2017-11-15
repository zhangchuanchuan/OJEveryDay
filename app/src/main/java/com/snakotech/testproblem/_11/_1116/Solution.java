package com.snakotech.testproblem._11._1116;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * Created by Administrator on 2017/11/15.
 */

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack1.isEmpty()) {
            stack1.push(node);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack2.push(node);
        }
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException();
        }
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return stack1.pop();
    }
}
