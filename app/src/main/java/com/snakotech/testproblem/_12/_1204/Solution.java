package com.snakotech.testproblem._12._1204;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * Created by Administrator on 2017/12/4.
 */

public class Solution {

    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode node = pHead;
        //1、只复制链表节点
        while (node != null) {
            RandomListNode newNode = new RandomListNode(node.label);
            RandomListNode nextNode = node.next;
            node.next = newNode;
            newNode.next = nextNode;
            node = newNode.next;
        }
        //2、指向兄弟节点
        node = pHead;
        while (node != null) {
            if (node.random != null) {
                RandomListNode random = node.random;
                node = node.next;
                node.random = random.next;
                node = node.next;
            } else {
                node = node.next;
            }
        }
        //3、拆出来
        node = pHead;
        RandomListNode result = null;
        RandomListNode tempNode = null;
        if (node != null) {
            result = pHead.next;
        }
        while (node != null) {
            RandomListNode nextNode = node.next;
            if (tempNode == null) {
                tempNode = nextNode;
            } else {
                tempNode.next = nextNode;
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            node = nextNode.next;
        }
        return result;
    }

    public class RandomListNode {
        int label;
        public RandomListNode next = null;
        RandomListNode random = null;

        public RandomListNode(int label) {
            this.label = label;
        }
    }

    public void println(RandomListNode node) {
        while (node != null) {
            System.out.print(node.label + "-->");
            node = node.next;
        }
        System.out.println();
    }
}
