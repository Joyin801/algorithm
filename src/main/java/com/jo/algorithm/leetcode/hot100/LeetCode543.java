package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2024/11/16
 * Author:Jo
 * Description:543. 二叉树的直径
 */
public class LeetCode543 {
    class Solution {
        int ans = 1;

        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return ans - 1;
        }

        private int depth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int l = depth(node.left);
            int r = depth(node.right);
            ans = Math.max(ans, l + r + 1);
            return Math.max(l, r) + 1;
        }
    }
}
