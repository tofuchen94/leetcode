package com.leetcode.problem58;
/**
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�������������һ�����ʣ��뷵�� 0 ��
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLastWord("Hello World"));
	}
	
	public int lengthOfLastWord(String s) {
		int i=s.length()-1;
		for(;i>=0&&s.charAt(i)==' ';i--);
		if(i==-1)return 0;
		int j=i;
		for(;j>=0;j--) {
			if(s.charAt(j)==' ')break;
		}
		return i-j;
	}
}
