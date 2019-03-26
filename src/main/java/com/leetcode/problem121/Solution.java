package com.leetcode.problem121;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int maxProfit(int[] prices) {
		if(prices==null||prices.length==0)return 0;
		int res=0;
		int min=prices[0];
		for(int i:prices) {
			if(i<min) min=i;
			res=Math.max(res, i-min);
		}
		return res;
	}
}
