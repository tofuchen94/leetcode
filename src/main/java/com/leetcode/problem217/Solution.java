package com.leetcode.problem217;

import java.util.Arrays;

/**
 * 给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0)return false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) {
        	if(nums[i]==nums[i-1])return true;
        }
        return false;
    }

}
