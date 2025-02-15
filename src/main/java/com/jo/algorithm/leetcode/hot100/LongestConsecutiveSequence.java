package com.jo.algorithm.leetcode.hot100;

import java.util.Arrays;
import java.util.List;

/**
 * Date:2025/2/13
 * Author:Jo
 * Description:128. Longest Consecutive Sequence
 */
public class LongestConsecutiveSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);
            int cur = 1;
            int max = 0;
            for (int i = 0; i < nums.length - 1; ++i) {
                if (nums[i + 1] - 1 == nums[i]) {
                    ++cur;
                } else if (nums[i] == nums[i + 1]) {
                } else {
                    max = Math.max(max, cur);
                    cur = 1;
                }
            }
            return Math.max(max, cur);
        }
    }
}
