package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/25
 * Author:Jo
 * Description:142. Linked List Cycle II
 */
public class LinkedListCycleII {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    while (slow != head) {
                        slow = slow.next;
                        head = head.next;
                    }
                    return head;
                }
            }
            return null;
        }
    }
}
