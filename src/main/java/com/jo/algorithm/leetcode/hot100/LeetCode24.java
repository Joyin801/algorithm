package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/6
 * Author:Jo
 * Description:24. 两两交换链表中的节点
 */
public class LeetCode24 {
    class Solution {
        //递归
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = head.next;
            head.next = swapPairs(newHead.next);
            newHead.next = head;
            return newHead;
        }

        //迭代
        public ListNode swapPairs2(ListNode head) {
            ListNode dummy = new ListNode(0, head);
            ListNode temp = dummy;
            while (temp.next != null && temp.next.next != null) {
                ListNode node1 = temp.next;
                ListNode node2 = temp.next.next;
                temp.next = node2;
                node1.next = node2.next;
                node2.next = node1;
                temp = node1;
            }
            return dummy.next;
        }
    }
}
