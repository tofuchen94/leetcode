package com.leetcode.problem349;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集
 * Created by tofuchen on 2019/3/31.
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0)return new int[0];
        if(nums2==null||nums2.length==0)return new int[0];
        Set<Integer> set1=new HashSet<Integer>();
        for(int i:nums1)set1.add(i);
        Set<Integer> set2=new HashSet<Integer>();
        for(int i:nums2){
            if(set1.contains(i))set2.add(i);
        }
        int[] res=new int[set2.size()];
        int index=0;
        for(int i:set2){
            res[index++]=i;
        }
        return res;
    }
}
