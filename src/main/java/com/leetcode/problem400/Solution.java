package com.leetcode.problem400;

/**
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 * 注意:n 是正数且在32为整形范围内 ( n < 2^31)。
 * Created by tofuchen on 2019/4/8.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().findNthDigit(100));
    }

    public int findNthDigit(int n) {
        if(n<10)return n;
        int i=1;
        int num=9;
        while(n>num&&num>0){
            n=n-num;
            num=(i+1)*(int)(9*Math.pow(10,i));
            i++;
        }
        n--;
        int start=(int)Math.pow(10,i-1);
        start=start+(n/i);
        int index=n%i;
        return helper(start,index);
    }

    private int helper(int start,int index){
        String str=Integer.toString(start);
        char ch=str.charAt(index);
        return 0+(ch-'0');
    }

}
