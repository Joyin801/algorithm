package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/23
 * Author:Jo
 * Description:75. 颜色分类
 */
public class LeetCode75 {
    class Solution {
        //单指针
        public void sortColors1(int[] nums) {
            int n = nums.length;
            int ptr = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] == 0) {
                    nums[i] = nums[ptr];
                    nums[ptr] = 0;
                    ++ptr;
                }
            }
            for (int i = ptr; i < n; ++i) {
                if (nums[i] == 1) {
                    nums[i] = nums[ptr];
                    nums[ptr] = 1;
                    ++ptr;
                }
            }
        }
        //todo
        public void sortColors2(int[] nums) {

        }

        public void sortColors3(int[] nums) {

        }
    }
}
