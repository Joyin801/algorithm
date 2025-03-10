package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/21
 * Author:Jo
 * Description:136. 只出现一次的数字
 */
public class LeetCode136 {
    //    1.任何数和 0 做异或运算，结果仍然是原来的数，即 a⊕0=a。
    //    2.任何数和其自身做异或运算，结果是 0，即 a⊕a=0。
    //    3.异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
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
