package com.leetcode.problem171;
/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号
 * @author tofuchen
 *
 */
public class Solution {
	
	public int titleToNumber(String s) {
        int res=0;
        for(int i=0;i<s.length();i++) {
        	res=res*26+(s.charAt(i)-'A'+1);
        }
        return res;
    }
}
