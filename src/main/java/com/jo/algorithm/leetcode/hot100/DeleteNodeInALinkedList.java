package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;

/**
 * Date:2025/2/26
 * Author:Jo
 * Description:237. Delete Node in a Linked List
 */
public class DeleteNodeInALinkedList {
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
