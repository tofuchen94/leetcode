package com.leetcode.problem66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ�����λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡� ����Լ���������� 0
 * ֮�⣬��������������㿪ͷ��
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int[] plusOne(int[] digits) {
		List<Integer> list=new ArrayList<Integer>();
		int a=1;
		for(int i=digits.length-1;i>=0;i--) {
			if(digits[i]==9&&a==1) {
				list.add(0);
				a=1;
			}else {
				list.add(digits[i]+a);
				a=0;
			}
		}
		if(a==1)list.add(a);
		int[] res=new int[list.size()];
		for(int i=0;i<res.length;i++) {
			res[i]=list.get(list.size()-1-i);
		}
		return res;
	}

}
