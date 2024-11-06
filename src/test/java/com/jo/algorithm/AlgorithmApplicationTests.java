package com.jo.algorithm;

import com.jo.algorithm.leetcode.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlgorithmApplicationTests {

    @Test
    void contextLoads() {
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode fast = head;
            ListNode slow = dummy;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }

        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }
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

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pre = null;
            ListNode ans = null;
            int sum, cur = 0;
            for (; l1 != null || l2 != null;
                 l1 = l1 != null ? l1.next : null, l2 = l2 != null ? l2.next : null) {
                sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + cur;
                cur = sum / 10 > 0 ? 1 : 0;
                if (ans == null) {
                    ans = new ListNode(sum % 10);
                    pre = ans;
                } else {
                    pre.next = new ListNode(sum % 10);
                    pre = pre.next;
                }
            }
            if (cur == 1) {
                pre.next = new ListNode(1);
            }
            return ans;
        }
    }
}
