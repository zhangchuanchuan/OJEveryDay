package com.snakotech.testproblem._11._1121;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * Created by Administrator on 2017/11/21.
 */

public class Solution {

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count ++;
        }
        return count;
    }

    public int NumberOf1_1(int n) {
        int count = 0;
        int temp = n;
        if (n < 0) {
            n = - n - 1;
        }
        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        if (temp > 0) {
            return count;
        } else {
            return 32 - count;
        }

    }

}
