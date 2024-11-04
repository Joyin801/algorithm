package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/5
 * Author:Jo
 * Description:234. 回文链表
 */
public class LeetCode234 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return false;
            }
            //先找到中间节点 slow = slow.next;fast = fast.next.next;
            ListNode secondNode = getMiddleNode(head).next;
            //反转节点后的链表
            ListNode reSecondNode = getSecondNode(secondNode);
            //前后两端链表进行匹配 f ？t
            ListNode firstNode = head;
            while (reSecondNode != null) {
                if (reSecondNode.val != firstNode.val) {
                    return false;
                }
                reSecondNode = reSecondNode.next;
                firstNode = firstNode.next;
            }
            return true;
        }

        //先找到中间节点 slow = slow.next;fast = fast.next.next;
        //1 2 3 4 5
        //s 2  3  f 3 5 ->null
        private ListNode getMiddleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private ListNode getSecondNode(ListNode head) {
            if (head == null || head.next == null) {
                return head;
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
    }
}
