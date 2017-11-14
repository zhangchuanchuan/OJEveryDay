package com.snakotech.testproblem._11;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/11/14.
 */

public class _1114 {
    public static void testMain() {
        Node head = new Node(1);
        Node temp = head;
        for (int i=2; i < 10; i++) {
            Node newNode = new Node(i);
            temp.next = newNode;
            temp = newNode;
        }
        printRevert(head);
    }

    public static void printRevert(Node head) {
        if (head.next != null) {
            printRevert(head.next);
        }
        System.out.println(head.value);
    }

    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
