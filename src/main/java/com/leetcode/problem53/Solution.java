package com.leetcode.problem53;
/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @author tofuchen
 *
 */
public class Solution {

	public int maxSubArray(int[] nums) {
		int res=Integer.MIN_VALUE;
		int sum=nums[0];
		for(int i=0;i<nums.length;i++) {
			res=Math.max(res, sum);
			if(sum>=0) {
				sum+=nums[i];
			}else {
				sum=nums[i];
			}
		}
		res=Math.max(res, sum);
		return res;
	}

}
