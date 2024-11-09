package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.ListNode;
import com.jo.algorithm.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2024/11/8
 * Author:Jo
 * Description:94. 二叉树的中序遍历
 */
public class LeetCode94 {
    //递归
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            inOrder(list, root);
            return list;
        }

        private static void inOrder(List<Integer> list, TreeNode root) {
            if (root == null) {
                return;
            }
            inOrder(list, root.left);
            list.add(root.val);
            inOrder(list, root.right);
        }
    }
}
