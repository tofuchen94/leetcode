package com.leetcode.problem136;

/**
 * ����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ��
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int singleNumber(int[] nums) {
		int tmp=nums[0];
		for(int i=1;i<nums.length;i++)tmp=tmp^nums[i];
		return tmp;
	}
}
