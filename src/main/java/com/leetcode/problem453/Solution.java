package com.leetcode.problem453;

/**
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
 *
 * 思路：每次移动可以看成最大值减一，则最终的答案就是将每个元素减到最小值的步数。
 * Created by tofuchen on 2019/4/22.
 */
public class Solution {

    public int minMoves(int[] nums) {
        if(nums==null||nums.length<2)return 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=(nums[i]-min);
        }
        return res;
    }


}
