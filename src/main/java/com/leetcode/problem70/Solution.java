package com.leetcode.problem70;

/**
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int climbStairs(int n) {
		if(n==1)return 1;
		if(n==2)return 2;
		int a1=1,a2=2;
		for(int i=3;i<=n;i++) {
			int a3=a1+a2;
			a1=a2;
			a2=a3;
		}
		return a2;
	}
}
