package com.leetcode.problem67;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。输入为非空字符串且只包含数字 1 和 0
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public String addBinary(String a, String b) {
		if(a==null||a.length()==0)return b;
		if(b==null||b.length()==0)return a;
		int i=a.length()-1;
		int j=b.length()-1;
		StringBuilder res=new StringBuilder();
		int add=0;
		while(i>=0||j>=0) {
			char aa='0';
			char bb='0';
			if(i>=0)aa=a.charAt(i);
			if(j>=0)bb=b.charAt(j);
			if(aa=='0'&&bb=='0') {
				if(add==0) {
					res.append(0);
				}else {
					res.append(1);
					add=0;
				}
			}else if(aa=='0'&&bb=='1') {
				if(add==0) {
					res.append(1);
				}else {
					res.append(0);
				}
			}else if(aa=='1'&&bb=='0') {
				if(add==0) {
					res.append(1);
				}else {
					res.append(0);
				}
			}else {
				if(add==0) {
					res.append(0);
					add=1;
				}else {
					res.append(1);
					add=1;
				}
			}
			i--;
			j--;
		}
		if(add==1)res.append(1);
		res.reverse();
		return res.toString();
	}
}
