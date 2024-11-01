package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/2
 * Author:Jo
 * Description:21. 合并两个有序链表
 */
public class LeetCode21 {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode pre = new ListNode(-1);
            ListNode prehead = pre;
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    pre.next = list2;
                    list2 = list2.next;
                } else {
                    pre.next = list1;
                    list1 = list1.next;
                }
                pre = pre.next;
            }
            pre.next = list1 == null ? list2 : list1;
            return prehead.next;
        }
    }
}
