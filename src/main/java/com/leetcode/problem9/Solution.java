package com.leetcode.problem9;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	public boolean isPalindrome(int x) {
		if(x<0)return false;
		String str = Integer.toString(x);
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
            right--;
		}
		return true;
	}
}
