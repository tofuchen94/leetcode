package com.leetcode.problem461;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意：
 * 0 ≤ x, y < 2^31
 * Created by tofuchen on 2019/5/23.
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int res=0;
        int xy=x^y;
        while(xy>0){
            if((xy&1)==1)res++;
            xy=xy>>1;
        }
        return res;
    }
}
