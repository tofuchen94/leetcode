package com.leetcode.problem258;
/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数
 * @author tofuchen
 *
 */
public class Solution {
	
	public int addDigits(int num) {
        while(num>=10) {
        	num=helper(num);
        }
        return num;
    }
	
	private int helper(int num) {
		int res=0;
		while(num>0) {
			res+=(num%10);
			num/=10;
		}
		return res;
	}

}
