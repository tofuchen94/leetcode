package com.leetcode.problem485;

/**
 *给定一个二进制数组， 计算其中最大连续1的个数。
 * Created by tofuchen on 2019/5/28.
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)l++;
            else l=0;
            res=Math.max(res,l);
        }
        return res;
    }
}
