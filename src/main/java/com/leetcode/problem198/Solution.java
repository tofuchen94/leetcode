package com.leetcode.problem198;
/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * @author tofuchen
 *
 */
public class Solution {
	
	public int rob(int[] nums) {
		if(nums==null||nums.length==0)return 0;
		if(nums.length==1)return nums[0];
		int a=0;
		int b=0;
		for(int i=0;i<nums.length;i++) {
			int c=Math.max(b, a+nums[i]);
			a=b;
			b=c;
		}
		return b;
    }

}
