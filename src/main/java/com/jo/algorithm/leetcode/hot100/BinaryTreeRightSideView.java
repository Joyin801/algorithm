package com.jo.algorithm.leetcode.hot100;

import com.jo.algorithm.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2025/2/27
 * Author:Jo
 * Description:199. Binary Tree Right Side View
 */
public class BinaryTreeRightSideView {
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            fun(list, 0, root);
            return list;
        }

        public void fun(List<Integer> list, int depth, TreeNode node) {
            if (node == null) {
                return;
            }
            if (depth == list.size()) {
                list.add(node.val);
            }
            fun(list, depth + 1, node.right);
            fun(list, depth + 1, node.left);
        }
    }
}
