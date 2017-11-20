package com.snakotech.testproblem._11._1120;

/**
 * 矩形覆盖:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 乍一看不知道如何下手，仔细一看还是斐波那契数列。
 * Created by Administrator on 2017/11/20.
 */

public class Solution {
    public int RectCover(int target) {
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
}
