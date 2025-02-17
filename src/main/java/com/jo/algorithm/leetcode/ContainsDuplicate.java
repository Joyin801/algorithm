package com.jo.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Date:2025/2/15
 * Author:Jo
 * Description:217. Contains Duplicate
 */
public class ContainsDuplicate {
    class Solution1 {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
        }
    }

    class Solution2 {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            return nums.length != set.size();
        }
    }

    class Solution3 {
        //用时间最少的方法
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
}
