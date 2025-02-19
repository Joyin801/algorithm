package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/19
 * Author:Jo
 * Description:162. Find Peak Element
 */
public class FindPeakElement {
    class Solution {
        ///二分查找
        public int findPeakElement(int[] nums) {
            //数组范围 闭区间 [0,n-2]
            //开区间 (-1,n-1)
            int left = -1;
            int right = nums.length - 1;
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return right;
        }
    }
}
