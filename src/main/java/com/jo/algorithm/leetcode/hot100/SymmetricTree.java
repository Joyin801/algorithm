package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2025/2/27
 * Author:Jo
 * Description:101. Symmetric Tree
 */
public class SymmetricTree {
    class Solution {

        public boolean isSameTree(TreeNode left, TreeNode right) {
            if (left == null || right == null) {
                return left == right;
            }
            return left.val == right.val
                    && isSameTree(left.left, right.right)
                    && isSameTree(left.right, right.left);
        }

        public boolean isSymmetric(TreeNode root) {
            return isSameTree(root.left, root.right);
        }

    }
}
