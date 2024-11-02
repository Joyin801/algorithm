package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/2
 * Author:Jo
 * Description:2.两数相加
 */
public class LeetCode2 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode curNode = null;
            ListNode ansHead = null;
            int sum = 0;
            int cur = 0;
            for (; l1 != null || l2 != null;
                 l1 = l1 != null ? l1.next : null, l2 = l2 != null ? l2.next : null) {
                sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + cur;
                cur = sum > 9 ? 1 : 0;

                if (ansHead == null) {
                    ansHead = new ListNode(sum % 10);
                    curNode = ansHead;
                } else {
                    curNode.next = new ListNode(sum % 10);
                    curNode = curNode.next;
                }
            }

            if (cur == 1) {
                curNode.next = new ListNode(1);
            }

            return ansHead;
        }
    }
}
