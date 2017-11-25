package com.snakotech.testproblem._11._1125;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * Created by Administrator on 2017/11/25.
 */

public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 != null && root2 != null) {
            if (isSubFromHead(root1, root2)) {
                return true;
            }
            if (HasSubtree(root1.left, root2)) {
                return true;
            }
            if (HasSubtree(root1.right, root2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSubFromHead(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                if (root2.left == null && root2.right == null) {
                    return true;
                } else {
                    if (isSubFromHead(root1.left, root2.left) && isSubFromHead(root1.right, root2.right)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}