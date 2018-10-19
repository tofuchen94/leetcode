package com.leetcode.problem119;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		if(rowIndex==0)return list;
		for(int i=1;i<=rowIndex+1;i++) {
			List<Integer> list1=new ArrayList<Integer>();
			for(int j=0;j<i;j++) {
				if(j==0||j==i-1)list1.add(1);
				else list1.add(list.get(j-1)+list.get(j));
			}
			list=list1;
		}
		return list;
	}
}
