package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2024/11/12
 * Author:Jo
 * Description:101. 对称二叉树
 */
public class LeetCode101 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return check(root.left, root.right);
        }

        private boolean check(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            return left.val == right.val
                    && check(left.left, right.right)
                    && check(left.right, right.left);
        }
    }
}
