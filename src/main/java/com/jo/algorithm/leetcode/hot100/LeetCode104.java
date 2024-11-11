package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

/**
 * Date:2024/11/11
 * Author:Jo
 * Description:104. 二叉树的最大深度
 */
public class LeetCode104 {
    //fun1 ： 深度优先搜索
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftCount = maxDepth(root.left);
            int rightCount = maxDepth(root.right);
            return Math.max(leftCount, rightCount) + 1;
        }
    }
    //fun2 ： 广度优先搜索

}
