package com.snakotech.testproblem._11._1119;

/**
 * 斐波那契数列
 * Created by Administrator on 2017/11/19.
 */

public class Solution {
    //斐波那契数列，1,1,2,3,5,8...
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int x = 1;
        int y = 1;
        int temp;
        for (int i = 2; i < n; i++) {
            temp = y;
            y = x + y;
            x = temp;
        }
        return y;
    }

    //跳台阶，可以跳1，可以跳2
    public int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int x = 1;
        int y = 2;
        int temp;
        for (int i=2; i < target; i++) {
            temp = y;
            y = x + y;
            x = temp;
        }
        return y;
    }


    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

    /**
     *  f(n-1) = f(1) + f(2) + ... + f(n-2) + 1;
     *  f(n) = f(1) + f(2) +...+f(n-1) + 1;
     *  f(n) = f(n-1) - 1 + f(n-1) + 1 = 2f(n-1)
     */
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int result = 1;
        for (int i=1; i < target; i++) {
            result = 2 * result;
        }
        return result;
    }



}
