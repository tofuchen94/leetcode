package com.leetcode.problem268;
/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数
 * @author tofuchen
 *
 */
public class Solution {
	
	public int missingNumber(int[] nums) {
		int sum=0;
		for(int i:nums)sum+=i;
		return (nums.length*(nums.length+1))/2-sum;
    }
}
