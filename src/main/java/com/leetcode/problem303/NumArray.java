package com.leetcode.problem303;

/**
 * 给定一个整数数组nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点
 * Created by tofuchen on 2019/3/27.
 */
public class NumArray {
    int[] sums;
    public NumArray(int[] nums) {
        if(nums==null||nums.length==0){
            sums=null;
            return;
        }
        sums=new int[nums.length];
        sums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sums[i]=sums[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(sums==null)return 0;
        if(i==0)return sums[j];
        return sums[j]-sums[i-1];
    }
}
