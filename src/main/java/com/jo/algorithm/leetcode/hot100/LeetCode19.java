package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2024/11/5
 * Author:Jo
 * Description:19. 删除链表的倒数第 N 个结点
 */
public class LeetCode19 {
    //n = 2
    //fast 1-2-3-4 fast->  3 -> null m=2
    //slow 0-1-2-3-4 slow-> m=2 ->2 2.next = 2.next.next
    //fast 领先 slow n+1个
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode fast = head;
            ListNode slow = dummy;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }
    }
}
