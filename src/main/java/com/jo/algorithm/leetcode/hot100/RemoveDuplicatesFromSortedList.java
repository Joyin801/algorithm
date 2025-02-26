package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/26
 * Author:Jo
 * Description:83. Remove Duplicates from Sorted List
 */
public class RemoveDuplicatesFromSortedList {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode cur = head;
            while (cur.next != null) {
                if (cur.next.val == cur.val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return head;
        }
    }
}
