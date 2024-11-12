package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2024/11/12
 * Author:Jo
 * Description:226. 翻转二叉树
 */
public class LeetCode226 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
            return root;
        }
    }
}
