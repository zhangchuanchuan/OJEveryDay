package com.snakotech.testproblem._12._1215;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * Created by Administrator on 2017/12/15.
 */

public class Solution {

    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        String[] strs = new String[numbers.length];
        for (int i=0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });

        for (int i=0; i < numbers.length; i++) {
            sb.append(strs[i]);
        }

        return sb.toString();
    }



}
