package com.snakotech.testproblem._11._1117;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int temp = array[0];
        for (int i=1; i < array.length; i++) {
            if (temp > array[i]) {
                return array[i];
            } else {
                temp = array[i];
            }
        }
        return temp;
    }
}