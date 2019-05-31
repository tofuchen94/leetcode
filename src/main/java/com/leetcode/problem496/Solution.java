package com.leetcode.problem496;

import java.util.Arrays;

/**
 * 给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
 * Created by tofuchen on 2019/5/31.
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        System.out.println(Arrays.toString(new Solution().nextGreaterElement(nums1,nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0)return new int[0];
        int[] res=new int[nums1.length];
        int[] helper=new int[nums2.length];
        helper[nums2.length-1]=-1;
        for(int i= nums2.length-2;i>=0;i--){
            int index=i+1;
            while(index!=-1&&nums2[index]<=nums2[i]){
                index=helper[index];
            }
            helper[i]=index;
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(helper[j]==-1){
                        res[i]=helper[j];
                    }else{
                        res[i]=nums2[helper[j]];
                    }
                    break;
                }
            }
        }
        return res;
    }
}

