package com.leetcode.problem121;

/**
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i
 * ��ļ۸���������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ��������� ע���㲻���������Ʊǰ������Ʊ��
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
