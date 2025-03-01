package com.jo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2025/2/16
 * Author:Jo
 * Description:1. Two Sum
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{i, map.get(target - nums[i])};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
}
