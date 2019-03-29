package com.leetcode.problem342;

/**
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方
 * Created by tofuchen on 2019/3/29.
 */
public class Solution {

    public boolean isPowerOfFour(int num) {
        //判断是否为2的幂
        if(num<0||(num&(num-1))!=0)return false;
        //判断二进制中的1是否在奇数位
        if((num&0x55555555)==0)return false;
        return true;
    }
}
