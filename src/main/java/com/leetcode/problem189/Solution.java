package com.leetcode.problem189;

/**
 * ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ���
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
