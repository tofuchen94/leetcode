package com.leetcode.problem204;
/**
 * ͳ������С�ڷǸ����� n ������������
 * @author tofuchen
 *
 */
public class Solution {
	
	public int countPrimes(int n) {
        int[] helper=new int[n];
        int count=0;
        for(int i=2;i<n;i++) {
        	if(helper[i]==0) {
        		count++;
        		for(int j=2;j*i<n;j++) {
        			helper[i*j]=1;
        		}
        	}
        	
        }
        return count;
    }
}
