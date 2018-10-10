package com.leetcode.problem69;

/**
 * 实现 int sqrt(int x) 函数。计算并返回 x 的平方根，其中 x 是非负整数。 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
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
