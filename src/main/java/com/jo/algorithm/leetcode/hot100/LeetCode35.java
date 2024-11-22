package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/10
 * Author:Jo
 * Description:35. 搜索插入位置
 */
public class LeetCode35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (target > nums[middle]) {
                    left = middle + 1;
                } else if (target < nums[middle]) {
                    right = middle - 1;
                } else {
                    return middle;
                }
            }
            return left;
        }
    }
}
