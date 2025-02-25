package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/26
 * Author:Jo
 * Description:143. Reorder List
 */
public class ReorderList {
    class Solution {
        public ListNode getMidListNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public ListNode reverse(ListNode head) {
            ListNode pre = null;
            ListNode next = null;
            ListNode cur = head;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

        public void reorderList(ListNode head) {
            //先找到链表中点
            ListNode midListNode = getMidListNode(head);
            //反转后半段链表
            ListNode head2 = reverse(midListNode);
            //开始链接
            ListNode next = null;
            ListNode next2 = null;
            while (head2.next != null) {
                next = head.next;
                next2 = head2.next;
                head.next = head2;
                head2.next = next;
                head = next;
                head2 = next2;
            }
        }
    }
}
