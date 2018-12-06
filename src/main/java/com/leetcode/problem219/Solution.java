package com.leetcode.problem219;
/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length<2)return false;
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<i+k+1&&j<nums.length;j++) {
        		if(nums[i]==nums[j])return true;
        	}
        }
        return false;
    }
}
