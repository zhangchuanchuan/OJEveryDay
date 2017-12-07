package com.snakotech.testproblem._12._1207;

/**
 * 数组中出现次数超过一半的数字
 * Created by Administrator on 2017/12/7.
 */

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int k = 0;
        int j = 0;
        if (array != null && array.length > 0) {
            k = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == k) {
                    j ++;
                } else {
                    j --;
                    if (j == 0) {
                        k = array[i];
                        j = 1;
                        if (i == array.length - 1) {
                            return 0;
                        }
                    }
                }
//                System.out.println("i:" + i + ", array:" + array[i] + ", k:" + k + ", j:" + j);
            }
        }
        return k;
    }
}
