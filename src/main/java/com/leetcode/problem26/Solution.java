package com.leetcode.problem26;
/**
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 * @author tofuchen
 *
 */
public class Solution {
	
	public int removeDuplicates(int[] nums) {
		if(nums==null||nums.length==0)return 0;
		int index=0;
		for(int i=1;i<nums.length&&index<nums.length;) {
			if(nums[i]==nums[index]) {
				i++;
			}else {
				nums[index+1]=nums[i];
				i++;
				index++;
			}
		}
		return index+1;
	}

}
