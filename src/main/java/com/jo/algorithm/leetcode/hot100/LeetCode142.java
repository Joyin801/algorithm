package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/3
 * Author:Jo
 * Description:142. 环形链表 II
 */
//fast 比 slow多走一圈
//slow = l + x
//fast = 2(l+x) = l + r + x --> l = r-x -- 环的入口
public class LeetCode142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null) {
                slow = slow.next;
                if (fast.next == null) {
                    return null;
                }
                fast = fast.next.next;
                if (slow == fast) {
                    ListNode ans = head;
                    while (ans != slow) {
                        ans = ans.next;
                        slow = slow.next;
                    }
                    return ans;
                }
            }
            return null;
        }
    }
}
