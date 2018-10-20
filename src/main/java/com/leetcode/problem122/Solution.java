package com.leetcode.problem122;

/**
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸����һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int maxProfit(int[] prices) {
		if(prices==null||prices.length==0)return 0;
		int res=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]-prices[i-1]>0)res+=prices[i]-prices[i-1];
		}
		return res;
	}
}
