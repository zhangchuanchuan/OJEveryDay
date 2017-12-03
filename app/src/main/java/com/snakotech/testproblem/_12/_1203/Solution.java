package com.snakotech.testproblem._12._1203;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 注意是到叶节点
 * Created by Administrator on 2017/12/3.
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root != null) {
            findSubPath(root, new ArrayList<Integer>(), 0, target, result);
        }
        return result;
    }


    private void findSubPath(TreeNode node, ArrayList<Integer> parentPath, int pre, int target, ArrayList<ArrayList<Integer>> result) {
        int val = node.val;
        ArrayList<Integer> path = new ArrayList<>(parentPath);
        path.add(val);
        int nowNum = val + pre;

        if (node.left != null) {
            findSubPath(node.left, path, nowNum, target, result);
        }

        if (node.right != null) {
            findSubPath(node.right, path, nowNum, target, result);
        }
        if (node.left == null && node.right == null) {
            if (nowNum == target) {
                result.add(path);
            }
        }
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
