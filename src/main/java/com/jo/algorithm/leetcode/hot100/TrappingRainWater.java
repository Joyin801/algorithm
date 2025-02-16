package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2025/2/16
 * Author:Jo
 * Description:42. Trapping Rain Water
 */
public class TrappingRainWater {
    class Solution1 {
        //时间复杂度O(n)
        //空间复杂度O(1)
        public int trap(int[] height) {
            int ans = 0;
            int preMax[] = new int[height.length];
            preMax[0] = height[0];
            for (int i = 1; i < height.length; i++) {
                preMax[i] = Math.max(preMax[i - 1], height[i]);
            }
            int subMax[] = new int[height.length];
            subMax[height.length - 1] = height[height.length - 1];
            for (int i = height.length - 2; i >= 0; i--) {
                subMax[i] = Math.max(subMax[i + 1], height[i]);
            }
            for (int i = 0; i < height.length; i++) {
                ans += Math.min(preMax[i], subMax[i]) - height[i];
            }
            return ans;
        }
    }

    class Solution2 {
        //时间复杂度O(n)
        //空间复杂度O(1)
        public int trap(int[] height) {
            int ans = 0;
            int left = 0;
            int right = height.length - 1;
            int preMax = 0;
            int subMax = 0;
            while (left <= right) {
                preMax = Math.max(height[left], preMax);
                subMax = Math.max(height[right], subMax);
                if (preMax < subMax) {
                    ans += preMax - height[left];
                    left++;
                } else {
                    ans += subMax - height[right];
                    right--;
                }
            }
            return ans;
        }
    }
}
