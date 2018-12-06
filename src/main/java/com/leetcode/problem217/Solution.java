package com.leetcode.problem217;

import java.util.Arrays;

/**
 * ����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��
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
