package com.snakotech.testproblem._12._1205;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * Created by Administrator on 2017/12/5.
 */

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null) {
            return null;
        }

        TreeNode left = pRootOfTree.left;
        TreeNode right = pRootOfTree.right;

        if (right != null) {
            TreeNode rightNode = Convert(right);
            pRootOfTree.right = rightNode;
            rightNode.left = pRootOfTree;
        }

        if (left == null) {
            return pRootOfTree;
        } else {
            TreeNode head = Convert(left);
            TreeNode next = head;
            while (next.right != null) {
                next = next.right;
            }
            next.right = pRootOfTree;
            pRootOfTree.left = next;
            return head;
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
