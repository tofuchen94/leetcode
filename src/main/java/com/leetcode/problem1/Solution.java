package com.leetcode.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ���������� ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
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
