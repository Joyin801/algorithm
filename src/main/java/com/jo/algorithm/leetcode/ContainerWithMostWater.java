package com.jo.algorithm.leetcode;

/**
 * Date:2025/2/16
 * Author:Jo
 * Description:11. Container With Most Water
 */
public class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int maxArea = 0;
            int curArea = 0;
            int x = 0;
            int y = height.length - 1;
            while (x < y) {
                curArea = (y - x) * Math.min(height[x], height[y]);
                maxArea = Math.max(curArea, maxArea);
                int temp = height[x] > height[y] ? --y : ++x;
            }
            return maxArea;
        }
    }

    class Solution2 {
        public int maxArea(int[] height) {
            int maxArea = 0;
            int x = 0;
            int y = height.length - 1;
            while (x < y) {
                int curArea = (y - x) * Math.min(height[x], height[y]);
                maxArea = Math.max(curArea, maxArea);
                if (height[x] < height[y]) {
                    ++x;
                } else {
                    --y;
                }
            }
            return maxArea;
        }
    }
}
