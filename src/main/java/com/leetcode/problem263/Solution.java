package com.leetcode.problem263;
/**
 * 编写一个程序判断给定的数是否为丑数。丑数就是只包含质因数 2, 3, 5 的正整数。
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isUgly(int num) {
		if(num==0)return false;
        if(num==1)return true;
        if(num%2==0)return isUgly(num/2);
        if(num%3==0)return isUgly(num/3);
        if(num%5==0)return isUgly(num/5);
        return false;
    }
}
