package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/22
 * Author:Jo
 * Description:92. Reverse Linked List II
 */
public class ReverseLinkedListII {
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(-1, head);
            ListNode p0 = dummy;
            for (int i = 0; i < left - 1; i++) {
                p0 = p0.next;
            }

            ListNode pre = null;
            ListNode cur = p0.next;
            ListNode next = null;
            for (int i = 0; i < right - left + 1; i++) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            p0.next.next = cur;
            p0.next = pre;
            return dummy.next;
        }
    }
}
