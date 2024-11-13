package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2024/11/13
 * Author:Jo
 * Description:108. 将有序数组转换为二叉搜索树
 */
public class LeetCode108 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }

        public TreeNode helper(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = (left + right + 1) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, left, mid - 1);
            root.right = helper(nums, mid + 1, right);
            return root;
        }
    }
}
