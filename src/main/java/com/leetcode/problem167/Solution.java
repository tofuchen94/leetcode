package com.leetcode.problem167;

/**
 * ����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������ ����Ӧ�÷����������±�ֵ index1 �� index2������ index1
 * ����С�� index2��
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int[] twoSum(int[] numbers, int target) {
		int left=0;
		int right=numbers.length-1;
		while(left<right) {
			if(numbers[left]+numbers[right]==target) {
				break;
			}else if(numbers[left]+numbers[right]<target){
				left++;
			}else {
				right--;
			}
		}
		int[] res=new int[] {left+1,right+1};
		return res;
	}
}
