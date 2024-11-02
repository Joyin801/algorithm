package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/2
 * Author:Jo
 * Description:141. 环形链表
 */
public class LeetCode141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode slowPoint = head;
            ListNode fastPoint = head.next;
            while (slowPoint != fastPoint) {
                if (fastPoint == null || fastPoint.next == null) {
                    return false;
                }
                slowPoint = slowPoint.next;
                fastPoint = fastPoint.next.next;
            }
            return true;
        }
    }
}
