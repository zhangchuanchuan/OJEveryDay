package com.snakotech.testproblem._11._1118;

/**
 * description：逆序输出链表
 * ===============================
 * creator：zhangchuanchuan
 * create time：2017/11/18 下午1:19
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */


import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        return reverseList(new ArrayList<Integer>(), listNode);
    }

    public ArrayList<Integer> reverseList(ArrayList<Integer> result, ListNode listNode) {
        if (listNode == null) {
            return result;
        }

        if (listNode.next != null) {
            reverseList(result, listNode.next);
            result.add(listNode.val);
        } else {
            result.add(listNode.val);
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}