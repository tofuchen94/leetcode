package com.leetcode.problem268;
/**
 * ����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ���
 * @author tofuchen
 *
 */
public class Solution {
	
	public int missingNumber(int[] nums) {
		int sum=0;
		for(int i:nums)sum+=i;
		return (nums.length*(nums.length+1))/2-sum;
    }
}
