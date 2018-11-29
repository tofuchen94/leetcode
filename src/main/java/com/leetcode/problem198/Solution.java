package com.leetcode.problem198;
/**
 * ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ������������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
 * ����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
 * @author tofuchen
 *
 */
public class Solution {
	
	public int rob(int[] nums) {
		if(nums==null||nums.length==0)return 0;
		if(nums.length==1)return nums[0];
		int a=0;
		int b=0;
		for(int i=0;i<nums.length;i++) {
			int c=Math.max(b, a+nums[i]);
			a=b;
			b=c;
		}
		return b;
    }

}
