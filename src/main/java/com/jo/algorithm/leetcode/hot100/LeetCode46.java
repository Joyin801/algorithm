package com.jo.algorithm.leetcode.hot100;

import org.springframework.javapoet.ParameterSpec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Date:2024/11/17
 * Author:Jo
 * Description:46. 全排列 回溯算法
 */
public class LeetCode46 {
    class Solution {
//        void backtracking(params) {
//            if (终止条件) {
//                存放收集结果;
//                return;
//            }
//            for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）){
//                处理节点;
//                backtracking(选择params);//递归
//                撤销处理结果;//回溯
//            }
//        }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> inlist = new ArrayList<>();
            for (int num : nums) {
                inlist.add(num);
            }
            int len = nums.length;
            backtrack(len, inlist, list, 0);
            return list;
        }

        private void backtrack(int len, List<Integer> inlist, List<List<Integer>> list, int cur) {
            if (len == cur) {
                list.add(new ArrayList<>(inlist));
            }
            for (int i = cur; i < len; i++) {
                Collections.swap(inlist, cur, i);
                backtrack(len, inlist, list, cur + 1);
                Collections.swap(inlist, cur, i);
            }
        }
    }
}
