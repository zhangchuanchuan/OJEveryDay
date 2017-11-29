package com.snakotech.testproblem._11._1129;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * Created by Administrator on 2017/11/29.
 */

import java.util.Stack;

public class Solution {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = stack.pop();
        temp.push(min);
        while (stack.size() > 0) {
            int value = stack.pop();
            if (value < min) {
                min = value;
            }
            temp.push(value);
        }
        while (temp.size() > 0) {
            stack.push(temp.pop());
        }
        return min;
    }
}