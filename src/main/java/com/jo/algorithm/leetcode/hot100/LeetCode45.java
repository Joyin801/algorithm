package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/17
 * Author:Jo
 * Description:45. 跳跃游戏 II
 */
public class LeetCode45 {
    class Solution {
        //方法一：反向查找出发位置
        public int jump1(int[] nums) {
            int n = nums.length - 1;
            int steps = 0;
            while (n > 0) {
                for (int i = 0; i < n; i++) {
                    if (i + nums[i] >= n) {
                        n = i;
                        steps += 1;
                        break;
                    }
                }
            }
            return steps;
        }
        //方法二：正向查找可到达的最大位置
    }
}
