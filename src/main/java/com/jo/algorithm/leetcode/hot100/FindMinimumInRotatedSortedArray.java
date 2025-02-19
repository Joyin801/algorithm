package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/19
 * Author:Jo
 * Description:153. Find Minimum in Rotated Sorted Array
 */
public class FindMinimumInRotatedSortedArray {
    class Solution {
        public int findMin(int[] nums) {
            int left = -1;
            int right = nums.length - 1;
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < nums[nums.length - 1]) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return nums[right];
        }
    }
}
