package com.leetcode.problem38;

/**
 * 报数序列是指一个整照其中的整数的顺序进数序列，按行报数，得到下一个数。其前五项如下：给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().countAndSay(4));
	}

	public String countAndSay(int n) {
		if(n==1)return "1";
		StringBuilder str=new StringBuilder("1");
		for(int i=1;i<n;i++) {
			str=helper(str);
		}
		return str.toString();
	}
	
	public StringBuilder helper(StringBuilder str) {
		StringBuilder res=new StringBuilder();
		int count=1;
		char pre=str.charAt(0);
		for(int i=1;i<str.length();) {
			if(str.charAt(i)==pre) {
				i++;
				count++;
			}else {
				res.append(count);
				res.append(pre);
				count=1;
				pre=str.charAt(i);
				i++;
			}
		}
		res.append(count);
		res.append(pre);
		return res;
	}

}
