package com.leetcode.problem169;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int majorityElement(int[] nums) {
		int now=nums[0];
		int count=1;
		for(int i=1;i<nums.length;i++) {
			if(now==nums[i])count++;
			else {
				count--;
				if(count==0) {
					now=nums[i];
					count=1;
				}
			}
		}
		return now;
	}

}
