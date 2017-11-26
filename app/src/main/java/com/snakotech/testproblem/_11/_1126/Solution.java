package com.snakotech.testproblem._11._1126;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * Created by Administrator on 2017/11/26.
 */

public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0) {
            return base;
        }
        if (exponent == 0) {
            return 1;
        }

        if (exponent < 0) {
            base = 1 / base;
            exponent = - exponent;
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
