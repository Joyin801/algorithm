package com.jo.algorithm.leetcode;

import java.util.*;

/**
 * Date:2025/2/13
 * Author:Jo
 * Description:49. Group Anagrams
 */
public class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                List<String> list = map.getOrDefault(key, new ArrayList<>());
                list.add(str);
                map.put(key, list);
            }
            return new ArrayList<>(map.values());
        }
    }
}
