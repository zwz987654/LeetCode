package com.company;

/**
 * Created by zouwenzhe on 2016-6-27.
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class No24 {
    static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0);
        ListNode p1 = head,p2 = head.next,temp = result;
        while (p1 != null && p2 != null) {
            temp.next = p2;
            p1.next = p2.next;
            p2.next = p1;

            temp = p1;//指针后移
            p1 = p1.next;
            if (p1!=null) {
                p2 = p1.next;
            }
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        h.next = h2;
        h2.next = h3;
        h3.next = h4;
        ListNode listNode = swapPairs(h);
        System.out.print(listNode);
    }
}
