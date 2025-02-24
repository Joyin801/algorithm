package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/25
 * Author:Jo
 * Description:142. Linked List Cycle II
 */
public class LinkedListCycleII {
    //假设总长a+b+c 直线a，环长b+c
    //slow移动距离a+b
    //fast移动距离a+b+k(b+c)
    //fast指针在环中距离入口b处相遇
    //假设fast是slow移动距离的2倍
    //2(a+b) = a+b+k(b+c)
    //2a+2b = a+b+b+c+(k-1)(b+c)
    //a-c = (k-1)(b+c)
    //在slow和fast相遇时，slw和head开始移动
    // head从头节点开始移动，slow从相遇点开始移动
    //走了c步后，slow在头节点，此时head距离环入口a-c
    //上面推出a-c = (k-1)(b+c)
    //head和slow继续走
    //head和slow必在入口初相遇
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    while (slow != head) {
                        slow = slow.next;
                        head = head.next;
                    }
                    return head;
                }
            }
            return null;
        }
    }
}
