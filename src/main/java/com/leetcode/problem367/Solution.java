package com.leetcode.problem367;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False
 * Created by tofuchen on 2019/4/2.
 */
public class Solution {

    public static void main(String[] args){
        System.out.println(new Solution().isPerfectSquare(808201));
    }

    public boolean isPerfectSquare(int num) {
        if(num<0)return false;
        if(num==0||num==1)return true;
        int i=1,j=num/2;
        while(i<j){
            long mid=i+(j-i)/2;
            long temp=mid*mid;
            if(temp==num)return true;
            else if(temp<num){
                i=(int)mid+1;
            }else {
                j=(int)mid - 1;
            }
        }
        if(i*i==num)return true;
        return false;
    }
}
