package com.snakotech.testproblem._12._1210;

import java.util.ArrayList;
import java.util.List;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 * Created by Administrator on 2017/12/10.
 */

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null) {
            return 0;
        }
        int lowMax = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] > 0) {
                break;
            }
            if (i == 0) {
                lowMax = array[0];
            }
            if (lowMax < array[i]) {
                lowMax = array[i];
            }
            if (i == array.length - 1) {
                return lowMax;
            }
        }

        int lastMore = 0;
        int lastLess = 0;
        int max = 0;
        int newMax = 0;
        for (int i=0; i < array.length;) {
            if (array[i] >= 0) {
                int more = 0;
                while (i < array.length && array[i] >=0) {
                    more = more + array[i];
                    i++;
                }
                if (max == 0) {
                    max = more;
                }
                if (lastMore + lastLess > 0) {
                    if (more >= lastLess) {
                        if (newMax == 0) {
                            newMax = lastMore + lastLess + more;
                        } else {
                            newMax = newMax + lastLess + more;
                        }
                    } else {
                        if (newMax > max) {
                            max = newMax;
                        }
                        newMax = 0;
                    }
                } else {
                    if (newMax > max) {
                        max = newMax;
                    }
                    newMax = 0;
                }
                lastMore = more;
            } else {
                int less = 0;
                while (i < array.length && array[i] < 0) {
                    less = less + array[i];
                    i++;
                }
                lastLess = less;
            }
        }
        if (newMax > max) {
            max = newMax;
        }
        return max;
    }
}
