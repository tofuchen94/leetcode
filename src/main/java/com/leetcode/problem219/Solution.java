package com.leetcode.problem219;
/**
 * ����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��ʹ�� nums [i] = nums [j]������ i �� j �Ĳ�ľ���ֵ���Ϊ k
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
