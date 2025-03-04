package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2025/2/27
 * Author:Jo
 * Description:110. Balanced Binary Tree
 */
public class BalancedBinaryTree {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;
        }

        public int getHeight(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int leftHeight = getHeight(node.left);
            if (leftHeight == -1) {
                return -1;
            }
            int rightHeight = getHeight(node.right);
            if (rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            }
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
