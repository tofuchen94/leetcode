package com.leetcode.problem231;
/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方
 * @author tofuchen
 *
 */
public class Solution {
	
//	public boolean isPowerOfTwo(int n) {
//        if(n<=0)return false;
//        int count=0;
//        for(int i=0;i<32;i++) {
//        	if(((n>>i)&1)==1)count++;
//        }
//        if(count==1)return true;
//        return false;
//    }
	
	public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        if((n&(n-1))==0)return true;
        return false;
    }
	
}
