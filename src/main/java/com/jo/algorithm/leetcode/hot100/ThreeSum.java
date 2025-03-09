package com.jo.algorithm.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date:2025/2/15
 * Author:Jo
 * Description:15. 3Sum
 */
public class ThreeSum {
    //    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    //    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    //    Notice that the solution set must not contain duplicate triplets.
    class Solution {
        public List<List<Integer>> threeSumV2(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            int len = nums.length;
            for (int i = 0; i < len - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                if (nums[i] + nums[i + 1] + nums[i + 2] > 0) {
                    break;
                }
                if (nums[i] + nums[len - 2] + nums[len - 1] < 0) {
                    continue;
                }
                int j = i + 1;
                int k = len - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                        j++;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        k--;
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }
                }

            }
            return res;
        }

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            int len = nums.length;
            for (int i = 0; i < len - 2; ++i) {
                //两个数字相同
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                //当前三个最小的数字之和已经大于0
                if (nums[i] + nums[i + 1] + nums[i + 2] > 0) {
                    break;
                }
                //当前nums[i]和最大的两个数字之和小于0
                if (nums[i] + nums[len - 2] + nums[len - 1] < 0) {
                    continue;
                }
                int j = i + 1;
                int k = len - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum > 0) {
                        k--;
                    } else if (sum < 0) {
                        j++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        result.add(list);
                        j++;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        k--;
                        while (k > j && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }
                }

            }
            return result;
        }

        public List<List<Integer>> threeSumIII(int[] nums) {
            List<List<Integer>> ans = new ArrayList();
            Arrays.sort(nums);
            int len = nums.length;
            for (int i = 0; i < len - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                if (nums[i] + nums[i + 1] + nums[i + 2] > 0) {
                    break;
                }
                if (nums[i] + nums[len - 1] + nums[len - 2] < 0) {
                    continue;
                }
                int j = i + 1;
                int k = len - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum > 0) {
                        k--;
                    } else if (sum < 0) {
                        j++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        ans.add(list);
                        j++;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        k--;
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
