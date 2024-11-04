package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/4
 * Author:Jo
 * Description:206. 反转链表
 */
public class LeetCode206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode pre = null;
            ListNode next = null;
            while(head != null){
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }
}
