package com.jo.algorithm.leetcode.hot100;

import java.util.Arrays;

/**
 * Date:2024/11/22
 * Author:Jo
 * Description:169. 多数元素
 */
public class LeetCode169 {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }
}
