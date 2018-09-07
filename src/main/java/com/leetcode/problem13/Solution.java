package com.leetcode.problem13;


/**
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().romanToInt("MCMXCIV"));
	}
	
	public int romanToInt(String s) {
		int res=0;
		for(int i=0;i<s.length();) {
			Character ch=s.charAt(i);
			if(ch=='M') {
				res+=1000;
				i++;
			}else if(ch=='D') {
				res+=500;
				i++;
			}else if(ch=='C') {
				if(i+1<s.length()&&s.charAt(i+1)=='D') {
					res+=400;
					i=i+2;
				}else if(i+1<s.length()&&s.charAt(i+1)=='M') {
					res+=900;
					i=i+2;
				}else {
					res+=100;
					i++;
				}
			}else if(ch=='L'){
				res+=50;
				i++;
			}else if(ch=='X') {
				if(i+1<s.length()&&s.charAt(i+1)=='L') {
					res+=40;
					i=i+2;
				}else if(i+1<s.length()&&s.charAt(i+1)=='C') {
					res+=90;
					i=i+2;
				}else {
					res+=10;
					i++;
				}
			}else if(ch=='V') {
				res+=5;
				i++;
			}else {
				if(i+1<s.length()&&s.charAt(i+1)=='V') {
					res+=4;
					i=i+2;
				}else if(i+1<s.length()&&s.charAt(i+1)=='X') {
					res+=9;
					i=i+2;
				}else {
					res+=1;
					i++;
				}
			}
			
		}
		return res;
	}
	
	
}
