package com.leetcode.problem118;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		if(numRows==0)return res;
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		res.add(list);
		if(numRows==1)return res;
		for(int i=2;i<=numRows;i++) {
			list=new ArrayList<Integer>();
			for(int j=0;j<i;j++) {
				if(j==0||j==i-1)list.add(1);
				else list.add(res.get(res.size()-1).get(j-1)+res.get(res.size()-1).get(j));
			}
			res.add(list);
		}
		return res;
	}

}
