package com.company;

/**
 * Created by zouwenzhe on 2016-6-24.
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class No21 {
    static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (l1!=null && l2!=null){
            if (l1.val <= l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l2 == null) p.next = l1;
        if (l1 == null) p.next = l2;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode ln0 = new ListNode(0);
        ListNode ln2 = new ListNode(2);
        ListNode ln4 = new ListNode(4);
        ln0.next = ln2;ln2.next = ln4;

        ListNode ln1 = new ListNode(1);
        ListNode ln3 = new ListNode(3);
        ListNode ln5 = new ListNode(5);
        ln1.next = ln3;ln3.next = ln4;
        ListNode listNode = mergeTwoLists(ln1, ln0);
    }
}
