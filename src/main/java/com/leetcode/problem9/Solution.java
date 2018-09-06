package com.leetcode.problem9;

/**
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * 
 * @author tofuchen
 *
 */
public class Solution {
	public boolean isPalindrome(int x) {
		if(x<0)return false;
		String str = Integer.toString(x);
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
            right--;
		}
		return true;
	}
}
