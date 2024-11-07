package com.jo.algorithm.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2024/11/7
 * Author:Jo
 * Description:560. 和为 K 的子数组
 */
public class LeetCode560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0, sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
    }
}
