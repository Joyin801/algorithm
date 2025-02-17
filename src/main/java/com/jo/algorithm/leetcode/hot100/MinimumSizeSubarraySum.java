package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/17
 * Author:Jo
 * Description:209. Minimum Size Subarray Sum
 */
public class MinimumSizeSubarraySum {
    class Solution {
        //时间复杂度O(n)
        //空间复杂度O(1)
        public int minSubArrayLen(int target, int[] nums) {
            int ans = nums.length + 1;
            int left = 0;
            int sum = 0;
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum >= target) {
                    ans = Math.min(ans, right - left + 1);
                    sum -= nums[left];
                    ++left;
                }
            }
            return ans >= nums.length + 1 ? 0 : ans;
        }
    }
}
