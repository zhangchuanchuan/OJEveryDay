package com.snakotech.testproblem._11._1123;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * Created by Administrator on 2017/11/23.
 */



public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        int linkedSize = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            linkedSize ++;
        }
        int index = linkedSize - k;
        if (index < 0) {
            return null;
        }
        ListNode result = head;
        for (int i=1; i <= index; i++) {
            result = result.next;
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