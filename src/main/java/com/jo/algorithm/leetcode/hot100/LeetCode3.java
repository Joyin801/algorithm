package com.jo.algorithm.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2024/11/2
 * Author:Jo
 * Description:3. 无重复字符的最长子串 3. Longest Substring Without Repeating Characters
 */
public class LeetCode3 {
    class Solution {
        //时间复杂度O(n)
        //空间复杂度O(128) O(1) O(set(s).size())
        public int lengthOfLongestSubstring(String s) {
            int ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            int left = 0;
            for (int right = 0; right < s.length(); right++) {
                char curChar = s.charAt(right);
                map.put(curChar, map.getOrDefault(curChar, 0) + 1);
                while (map.get(curChar) > 1) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    left++;
                }
                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    }
}