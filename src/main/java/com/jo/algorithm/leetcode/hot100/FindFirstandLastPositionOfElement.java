package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/18
 * Author:Jo
 * Description:34. Find First and Last Position of Element in Sorted Array
 */
public class FindFirstandLastPositionOfElement {
    class Solution {

        public static int lowerBound(int[] nums, int target) {
            //开区间（left，right）
            int left = -1;
            int right = nums.length;
            while (left + 1 < right) { //空间不为空
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid; //(mid,right)
                } else {
                    right = mid; //(left,mid)
                }
            }
            return right;
        }

        public int[] searchRange(int[] nums, int target) {
            int start = lowerBound(nums, target);
            if (start == nums.length || nums[start] != target) {
                return new int[]{-1, -1};
            }
            int end = lowerBound(nums, target + 1) - 1;
            return new int[]{start, end};
        }
    }
}
