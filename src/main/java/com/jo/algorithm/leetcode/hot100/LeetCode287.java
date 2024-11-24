package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/24
 * Author:Jo
 * Description:287. 寻找重复数
 */
public class LeetCode287 {
    class Solution {
        public int findDuplicate(int[] nums) {
            int len = nums.length;
            int left = 1;
            int right = len - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                int count = 0;
                for (int num : nums) {
                    if (num <= mid) {
                        count++;
                    }
                }
                if (count > mid) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
}
