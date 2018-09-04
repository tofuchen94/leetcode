package com.leetcode.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
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
