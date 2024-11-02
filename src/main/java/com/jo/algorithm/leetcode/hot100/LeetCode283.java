package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/2
 * Author:Jo
 * Description:283. 移动零
 */
public class LeetCode283 {
//    给定一个数组 nums，
//    编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    class Solution {
        public void moveZeroes(int[] nums) {
            int cur = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] != 0) {
                    nums[cur] = nums[i];
                    cur++;
                }
            }
            for (int i = cur; i < nums.length; ++i) {
                nums[i] = 0;
            }
        }
    }
}
