package com.leetcode.problem69;

/**
 * ʵ�� int sqrt(int x) ���������㲢���� x ��ƽ���������� x �ǷǸ������� ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().mySqrt(8));
	}
	
	public int mySqrt(int x) {
		if(x==1||x==0)return x;
		long left=1;
		long right=x;
		while(left<right) {
			long mid=left+(right-left)/2;
			if(mid*mid==x)return (int)mid;
			else if(mid*mid<x) {
				if(right==left+1) {
					if(right*right>x)return (int)left;
					else return (int)right;
				}else {
					left=mid;
				}
			}
			else right=mid-1;
		}
		return (int)left;
	}
}
