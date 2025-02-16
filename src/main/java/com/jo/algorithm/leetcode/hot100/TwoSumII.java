package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/16
 * Author:Jo
 * Description:167. Two Sum II - Input Array Is Sorted
 */
public class TwoSumII {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;
            while (true) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) {
                    break;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
            return new int[]{left + 1, right + 1};
        }
    }
}
