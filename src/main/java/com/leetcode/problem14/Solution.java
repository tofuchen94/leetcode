package com.leetcode.problem14;
/**
 * ��дһ�������������ַ��������е������ǰ׺����������ڹ���ǰ׺�����ؿ��ַ��� ""��
 * @author tofuchen
 *
 */
public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<strs[0].length();i++) {
        	char ch=strs[0].charAt(i);
        	for(int j=0;j<strs.length;j++) {
        		if(i>=strs[j].length()||strs[j].charAt(i)!=ch) {
        			return res.toString();
        		}
        	}
        	res.append(ch);
        }
        return res.toString();
    }

}
