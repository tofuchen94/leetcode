package com.leetcode.problem136;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int singleNumber(int[] nums) {
		int tmp=nums[0];
		for(int i=1;i<nums.length;i++)tmp=tmp^nums[i];
		return tmp;
	}
}
