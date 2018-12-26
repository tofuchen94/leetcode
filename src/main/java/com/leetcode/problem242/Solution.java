package com.leetcode.problem242;
/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())return false; 
        int[] helper=new int[26];
        for(int i=0;i<s.length();i++) {
        	helper[s.charAt(i)-'a']++;
        	helper[t.charAt(i)-'a']--;
        }
        for(int i:helper) {
        	if(i!=0)return false;
        }
        return true;
    }
}
