package com.leetcode.problem283;

/**
 * Created by tofuchen on 2019/3/26.
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length<=1)return;
        int firstZeroIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
               firstZeroIndex=i;
                break;
            }
        }
        if(firstZeroIndex==-1)return;
        for(int i=firstZeroIndex+1;i<nums.length;i++) {
            if (nums[i] != 0) {
                swap(nums,firstZeroIndex,i);
                firstZeroIndex++;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }

}
