package com.leetcode.problem58;
/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
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
