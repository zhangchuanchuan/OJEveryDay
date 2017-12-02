package com.snakotech.testproblem._12._1202;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * Created by Administrator on 2017/12/2.
 */

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        int start = 0;
        int end = sequence.length - 1;
        return checkSub(sequence, 0, end);
    }

    public boolean checkSub(int[] sequence, int start, int end) {
        if (end - start <= 1) {
            return true;
        }

        int root = sequence[end];
        int middle = start;
        for (int i = start; i <= end; i++) {
            //第i到end-1个是end的右子树，start到
            if (sequence[i] > root) {
                middle = i;
                break;
            }
            if (i == end) {
                middle = end;
            }
        }
        for (int i = middle; i <= end; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }
        return checkSub(sequence, start, middle - 1) && checkSub(sequence, middle, end - 1);
    }

}
