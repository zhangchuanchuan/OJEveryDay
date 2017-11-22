package com.snakotech.testproblem._11._1122;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * Created by Administrator on 2017/11/22.
 */

public class Solution {
    public void reOrderArray(int [] array) {
        if (array == null) {
            return;
        }
        int length = array.length;
        for (int i=0; i < length; i++) {
            if (array[i] % 2 == 1) {
                int j = i - 1;
                while (j >= 0) {
                    if (array[j] % 2 == 0) {
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                        j --;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
