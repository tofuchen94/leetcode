package com.leetcode.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			int k=target-nums[i];
			if(map.containsKey(k)) {
				return new int[] {map.get(k),i};
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
