package com.leetcode.problem35;

/**
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int searchInsert(int[] nums, int target) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=(left+right)/2;
			if(nums[mid]==target)return mid;
			else if(nums[mid]<target)left=mid+1;
			else right=mid;
		}
		if(nums[left]==target)return left;
		else if(nums[left]<target)return left+1;
		else return left;
	}
}
