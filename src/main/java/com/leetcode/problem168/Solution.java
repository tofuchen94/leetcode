package com.leetcode.problem168;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		String res=new Solution().convertToTitle(2);
		System.out.println(res);
	}
	
	public String convertToTitle(int n) {
		StringBuilder res=new StringBuilder();
		while(n>0) {
			res=res.append((char)('A'+(n-1)%26));
			n=(n-1)/26;
		}
		res=res.reverse();
		return res.toString();
	}
	

}
