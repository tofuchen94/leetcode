package com.leetcode.problem66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。 你可以假设除了整数 0
 * 之外，这个整数不会以零开头。
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int[] plusOne(int[] digits) {
		List<Integer> list=new ArrayList<Integer>();
		int a=1;
		for(int i=digits.length-1;i>=0;i--) {
			if(digits[i]==9&&a==1) {
				list.add(0);
				a=1;
			}else {
				list.add(digits[i]+a);
				a=0;
			}
		}
		if(a==1)list.add(a);
		int[] res=new int[list.size()];
		for(int i=0;i<res.length;i++) {
			res[i]=list.get(list.size()-1-i);
		}
		return res;
	}

}
