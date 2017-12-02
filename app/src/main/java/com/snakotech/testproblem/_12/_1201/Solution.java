package com.snakotech.testproblem._12._1201;

import java.util.ArrayList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * Created by Administrator on 2017/12/2.
 */

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root != null) {
            ArrayList<TreeNode> firstLineNode = new ArrayList<>();
            firstLineNode.add(root);
            addNextLine(firstLineNode, result);
        }
        return result;
    }

    private void addNextLine(ArrayList<TreeNode> nodeList, ArrayList<Integer> result) {
        if (nodeList == null || result == null || nodeList.size() == 0) {
            return;
        }
        ArrayList<TreeNode> nextLineNode = new ArrayList<>();
        for (TreeNode node : nodeList) {
            result.add(node.val);
            if (node.left != null) {
                nextLineNode.add(node.left);
            }
            if (node.right != null) {
                nextLineNode.add(node.right);
            }
        }
        if (nextLineNode.size() > 0) {
            addNextLine(nextLineNode, result);
        }
    }

    public class TreeNode {
        int val = 0;
        public TreeNode left = null;
        public TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}