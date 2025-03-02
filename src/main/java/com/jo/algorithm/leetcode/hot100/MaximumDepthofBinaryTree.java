package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2025/2/27
 * Author:Jo
 * Description:104. Maximum Depth of Binary Tree
 */
public class MaximumDepthofBinaryTree {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftLen = maxDepth(root.left);
            int rigthLen = maxDepth(root.right);

            return Math.max(leftLen, rigthLen) + 1;
        }
    }
}
