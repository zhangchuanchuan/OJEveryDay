package com.snakotech.testproblem._12._1208;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * Created by Administrator on 2017/12/8.
 */

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if (input != null) {
            //竟然还有这个判断，题目还有一个要求就是k如果大于input的长度就返回空list
            if (input.length < k) {
                return result;
            }

            for (int i = 0; i < input.length; i++) {
                Integer temp = input[i];
                insertToList(result, temp);
                if (result.size() > k) {
                    result.remove(result.size() - 1);
                }
            }
        }
        return result;
    }

    private void insertToList(ArrayList<Integer> list, int target) {
        if (list.size() == 0) {
            list.add(target);
            return;
        }
        for (int i=0; i < list.size(); i++) {
            int temp = list.get(i);
            if (temp > target) {
                list.add(i, target);
                return;
            }

            if (i == list.size() - 1) {
                list.add(target);
                return;
            }
        }
    }
}
