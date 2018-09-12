package com.leetcode.problem27;

/**
 * ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ� Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int removeElement(int[] nums, int val) {
		if(nums==null||nums.length==0)return 0;
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[index++]=nums[i];
			}
		}
		return index;
	}

}
