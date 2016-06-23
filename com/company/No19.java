package com.company;

/**
 * Created by zouwenzhe on 2016-6-23.
 * Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.
 */
public class No19 {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }
    //只用一次遍历去除链表倒数第N个元素并正序显示
    //此题可以用双指针,把距离n理解为一个框,推动框向后移动
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        //如果指针指向最后一个，直接去除链表第二个并返回
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
