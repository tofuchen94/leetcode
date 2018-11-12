package com.leetcode.problem189;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		helper(nums,0,nums.length-k-1);
		helper(nums,nums.length-k,nums.length-1);
		helper(nums,0,nums.length-1);
	}
	
	private void helper(int[] nums,int left,int right) {
		while(left<right) {
			int temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
}
