package com.jo.algorithm.leetcode.hot100;

/**
 * Date:2024/11/15
 * Author:Jo
 * Description:121. 买卖股票的最佳时机
 */
public class LeetCode121 {
    public class Solution {
        public int maxProfit(int prices[]) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minprice) {
                    minprice = prices[i];
                } else if (prices[i] - minprice > maxprofit) {
                    maxprofit = prices[i] - minprice;
                }
            }
            return maxprofit;
        }

        public int maxProfit2(int prices[]) {
            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;
            for (int i = 0; i < prices.length; i++) {
                minPrice = Math.min(prices[i], minPrice);
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
            return minPrice;
        }

    }
}
