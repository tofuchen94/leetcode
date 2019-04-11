package com.leetcode.problem414;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)
 * Created by tofuchen on 2019/4/11.
 */
public class Solution {

    public int thirdMax(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        Set<Integer> set=new HashSet<Integer>();
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        int i=0;
        while(queue.size()<3&&i<nums.length){
            if(!set.contains(nums[i])){
                queue.add(nums[i]);
                set.add(nums[i]);
            }
            i++;
        }
        if(queue.size()<3){
            if(queue.size()>1)queue.poll();
            return queue.poll();
        }
        for(;i<nums.length;i++){
            if(!set.contains(nums[i])){
                int k=queue.peek();
                if(nums[i]>k){
                    queue.poll();
                    queue.add(nums[i]);
                }
                set.add(nums[i]);
            }
        }
        return queue.poll();
    }
}
