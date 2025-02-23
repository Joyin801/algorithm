package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/22
 * Author:Jo
 * Description:25. Reverse Nodes in k-Group
 */
public class ReverseNodesInKGroup {
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            int count = 0;
            ListNode cur = head;

            while (cur != null) {
                cur = cur.next;
                count++;
            }

            ListNode dummy = new ListNode(-1, head);
            ListNode p0 = dummy;
            ListNode pre = null;
            ListNode next = null;
            cur = p0.next;

            while (count >= k) {
                count -= k;
                for (int i = 0; i < k; i++) {
                    next = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = next;
                }
                next = p0.next;
                p0.next.next = cur;
                p0.next = pre;
                p0 = next;
            }
            return dummy.next;
        }
    }
}
