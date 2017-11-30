package com.snakotech.testproblem._11._1130;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * Created by Administrator on 2017/11/30.
 */

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int size = pushA.length;
        int first = popA[0];
        int index = 0;
        boolean[] booleans = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (pushA[i] == first) {
                index = i;
                break;
            }
            if (i == size - 1) {
                return false;
            }
        }
        booleans[index] = true;
        for (int i=1; i < size; i++) {
            boolean down = false;
            boolean up = false;
            int downIndex = index - 1;
            while (downIndex >= 0) {
                if (!booleans[downIndex]) {
                    if (pushA[downIndex] == popA[i]) {
                        booleans[downIndex] = true;
                        index = downIndex;
                        down = true;
                        break;
                    } else {
                        down = false;
                        break;
                    }
                } else {
                    downIndex -- ;
                }
            }

            if (down) {
                continue;
            }

            int upIndex = index + 1;
            while (upIndex < size) {
                if (!booleans[upIndex]) {
                    if (pushA[upIndex] == popA[i]) {
                        booleans[upIndex] = true;
                        index = upIndex;
                        up = true;
                        break;
                    }
                }
                upIndex++;
            }
            if (up) {
                continue;
            }
            if (upIndex == size && downIndex == -1) {
                return true;
            }
            return false;

        }
        return true;
    }
}
