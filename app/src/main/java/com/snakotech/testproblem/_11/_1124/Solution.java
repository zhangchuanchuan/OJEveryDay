package com.snakotech.testproblem._11._1124;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * Created by Administrator on 2017/11/25.
 */

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = null;
        ListNode temp = result;
        while (list1 != null && list2 != null) {
            ListNode node;
            if (list1.val > list2.val) {
                node = list2;
                list2 = list2.next;
            } else {
                node = list1;
                list1 = list1.next;
            }
            node.next = null;
            if (result == null) {
                result = node;
                temp = result;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        if (list1 == null) {
            temp.next = list2;
        }
        if (list2 == null) {
            temp.next = list1;
        }
        return result;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}