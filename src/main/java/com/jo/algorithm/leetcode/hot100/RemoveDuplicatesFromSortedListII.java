package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/26
 * Author:Jo
 * Description:82. Remove Duplicates from Sorted List II
 */
public class RemoveDuplicatesFromSortedListII {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(-1, head);
            ListNode cur = dummy;
            int val = 0;
            while (cur.next != null && cur.next.next != null) {
                val = cur.next.val;
                if (val == cur.next.next.val) {
                    while (cur.next != null && val == cur.next.val) {
                        cur.next = cur.next.next;
                    }
                } else {
                    cur = cur.next;
                }
            }
            return dummy.next;
        }
    }
}
