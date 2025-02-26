package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/26
 * Author:Jo
 * Description:19. Remove Nth Node From End of List
 */
public class RemoveNthNodeFromEndOfList {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1, head);
            ListNode rigth = dummy;
            for (int i = 0; i < n; i++) {
                rigth = rigth.next;
            }
            ListNode left = dummy;
            while (rigth.next != null) {
                rigth = rigth.next;
                left = left.next;
            }
            left.next = left.next.next;
            return dummy.next;
        }
    }
}
