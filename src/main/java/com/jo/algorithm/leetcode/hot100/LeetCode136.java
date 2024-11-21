package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/21
 * Author:Jo
 * Description:136. 只出现一次的数字
 */
public class LeetCode136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }
    }
}
