package com.snakotech.testproblem._12._1211;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13
 * 因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,
 * 并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 * Created by Administrator on 2017/12/11.
 */

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0) {
            return 0;
        }
        int ones = 0;
        for (int m = 1; m <= n; m*=10) {
            int a = n / m, b = n % m;
            if (a % 10 == 0) {
                ones += a / 10 * m;
            } else if (a % 10 == 1) {
                ones += (a/10 * m) + (b + 1);
            } else {
                ones += (a/10 + 1)*m;
            }

        }
        return ones;
    }

}
