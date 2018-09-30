package com.leetcode.problem53;
/**
 * ����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
 * @author tofuchen
 *
 */
public class Solution {

	public int maxSubArray(int[] nums) {
		int res=Integer.MIN_VALUE;
		int sum=nums[0];
		for(int i=0;i<nums.length;i++) {
			res=Math.max(res, sum);
			if(sum>=0) {
				sum+=nums[i];
			}else {
				sum=nums[i];
			}
		}
		res=Math.max(res, sum);
		return res;
	}

}
