package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/15
 * Author:Jo
 * Description:283. Move Zeroes
 */
public class MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int cur = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[cur++] = nums[i];
                }
            }
            for (int i = cur; i < nums.length; i++) {
                nums[i] = 0;
            }

        }
    }
}
