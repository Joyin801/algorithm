package com.jo.algorithm.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2024/11/18
 * Author:Jo
 * Description:763. 划分字母区间
 */
public class LeetCode763 {
    public static void main(String[] args) {
        for (Integer i : partitionLabels("ababcbacadefegdehijhklij")) {
            System.out.println(i);
        }
    }

    private static List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int len = s.length();

        for (int i = 0; i < len; i++) {
            last[s.charAt(i) - 'a'] = i;
            System.out.println(s.charAt(i) - 'a' + "=====" + last[s.charAt(i) - 'a']);
        }
        for (int i = 0; i < last.length; i++) {
            System.out.println(i + "---" + last[i]);
        }
        List<Integer> list = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < len; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                list.add(end - start + 1);
                start = end + 1;
            }
        }
        return list;
    }
}
