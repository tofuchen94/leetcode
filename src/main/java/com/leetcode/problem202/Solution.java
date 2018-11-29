package com.leetcode.problem202;

import java.util.HashSet;
import java.util.Set;

/**
 * ��дһ���㷨���ж�һ�����ǲ��ǡ�����������
 * һ����������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ����������ѭ����ʼ�ձ䲻�� 1��������Ա�Ϊ 1����ô��������ǿ�������
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<Integer>();
        while(!set.contains(n)&&n!=1) {
        	set.add(n);
        	n=helper(n);
        }
        if(set.contains(n))return false;
        return true;
    }
	
	private int helper(int n) {
		int res=0;
		while(n!=0) {
			res+=((n%10)*(n%10));
			n=n/10;
		}
		return res;
	}

}
