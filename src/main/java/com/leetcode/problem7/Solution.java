package com.leetcode.problem7;

/**
 * ����һ�� 32 λ�з����������������е����ֽ��з�ת
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int num=1463847412;
		System.out.println(new Solution().reverse(num));
	}

	public int reverse(int x) {
		int a1=Integer.MAX_VALUE/10;
		int a2=Integer.MAX_VALUE%10;
		boolean isZhen=x>0?true:false;
		if(x==Integer.MIN_VALUE)return 0;
		x=Math.abs(x);
		int res=0;
		while(x>0) {
			if(res>a1)return 0;
			if(res==a1&&x%10>a2)return 0;
			res=res*10+x%10;
			x=x/10;
		}
		if(isZhen)return res;
		else return -res;
	}

}
