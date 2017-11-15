package com.snakotech.testproblem._11;

/**
 * 重建二叉树
 * Created by Administrator on 2017/11/15.
 */
public class _1115 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(val).append(",");
            if (left != null) {
                sb.append(left);
            }
            if (right != null) {
                sb.append(right);
            }
            return sb.toString();
        }
    }

    public static void testMain() {
        int[] pre = new int[]{1,2,3,4,5,6,7};
        int[] in = new int[]{3,2,4,1,6,5,7};
        _1115 o = new _1115();
        System.out.println(o.reConstructBinaryTree(pre, in));
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || pre.length == 0) {
            return null;
        }
        return contractNode(pre, in, 0, 0, pre.length);
    }

    public TreeNode contractNode(int[] pre, int[] in, int startPre, int startIn, int size) {
        if (size > 1) {
            TreeNode head = new TreeNode(pre[startPre]);
            int headIndex = 0;
            for (int i=startIn; i < startIn + size; i++) {
                if (pre[startPre] == in[i]) {
                    headIndex = i;
                    break;
                }
            }
            int leftSize = headIndex - startIn;
            int rightSize = size - leftSize - 1;
            if (leftSize > 0) {
                head.left = contractNode(pre, in, startPre + 1, startIn, leftSize);
            }
            if (rightSize > 0) {
                head.right = contractNode(pre, in, startPre + leftSize + 1, headIndex + 1,rightSize);
            }
            return head;
        } else if (size == 1) {
            return new TreeNode(pre[startPre]);
        }
        return null;
    }
}
