package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/2
 * Author:Jo
 * Description:53. 最大子数组和
 */
public class LeetCode53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = 0, max = nums[0];
            for (int num : nums) {
                sum = Math.max(num, sum + num);
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}