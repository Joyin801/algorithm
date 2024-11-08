package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/8
 * Author:Jo
 * Description:189. 轮转数组
 */
public class LeetCode189 {
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                ++start;
                --end;
            }
        }
    }
}
