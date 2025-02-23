package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/22
 * Author:Jo
 * Description:92. Reverse Linked List II
 */
public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Solution.reverseBetween(head, 2, 4);
    }

    class Solution {
        public static ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(-1, head);
            ListNode p0 = dummy; //此时p0和dummy指向同一个节点
            for (int i = 0; i < left - 1; i++) {
                p0 = p0.next;
            } //此时p0为反转链表段的前一个节点，
            // 此后dummy和p0也不再指向同一个节点
            //也是在最后return dummy.next而不是p0.next的原因
            ListNode pre = null;
            ListNode cur = p0.next; //需要反转链表的第一个节点
            ListNode next = null;
            for (int i = 0; i < right - left + 1; i++) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            p0.next.next = cur; //反转链表后，反转段的头节点变为反转段的末节点，需要将末节点指向没有被反转的链表的第二段节点的头
            p0.next = pre; // 非反转链表的第一段节点的末节点指向被反转段的头节点
            return dummy.next;
        }
    }
}
