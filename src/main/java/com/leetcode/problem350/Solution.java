package com.leetcode.problem350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * Created by tofuchen on 2019/3/31.
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0)return new int[0];
        if(nums2==null||nums2.length==0)return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] res=new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
        return res;
    }
}
