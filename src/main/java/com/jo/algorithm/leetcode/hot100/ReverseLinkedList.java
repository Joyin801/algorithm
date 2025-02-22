package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/22
 * Author:Jo
 * Description:206. Reverse Linked List
 */
public class ReverseLinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode next = null;
            while (head != null) {
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }
}

