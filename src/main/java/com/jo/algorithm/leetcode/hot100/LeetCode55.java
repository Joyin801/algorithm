package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/17
 * Author:Jo
 * Description:55. 跳跃游戏
 */
public class LeetCode55 {
    class Solution {
        public boolean canJump(int[] nums) {
            int len = nums.length;
            int maxStep = 0;
            for (int i = 0; i < len; ++i) {
                if (i <= maxStep) {
                    maxStep = Math.max(maxStep, i + nums[i]);
                    if (maxStep >= len - 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
