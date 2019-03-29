package com.leetcode.problem326;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方
 * Created by tofuchen on 2019/3/29.
 */
public class Solution {

    public boolean isPowerOfThree(int n) {
        return n>0&&1162261467%n==0;
    }
}
