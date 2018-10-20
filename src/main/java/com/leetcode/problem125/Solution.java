package com.leetcode.problem125;

/**
 * ����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isPalindrome(String s) {
		if(s==null||s.length()==0)return true;
		String ss = s.toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ss.length();i++) {
			char ch=ss.charAt(i);
			if(ch>='a'&&ch<='z')sb.append(ch);
			if(ch>='0'&&ch<='9')sb.append(ch);
		}
		ss=sb.toString();
		for(int i=0;i<ss.length()/2;i++) {
			if(ss.charAt(i)!=ss.charAt(ss.length()-1-i))return false;
		}
		return true;
	}
}
