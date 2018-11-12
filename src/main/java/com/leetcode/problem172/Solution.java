package com.leetcode.problem172;

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int trailingZeroes(int n) {
		int res=0;
		while(n>0) {
			n=n/5;
			res+=n;
		}
		return res;
	}
}
