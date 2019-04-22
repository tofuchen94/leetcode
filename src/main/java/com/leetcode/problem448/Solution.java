package com.leetcode.problem448;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * Created by tofuchen on 2019/4/22.
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(new Solution().findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();
        if(nums==null||nums.length<2)return res;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i+1&&nums[nums[i]-1]!=nums[i]){
                int index=nums[i]-1;
                nums[i]=nums[index];
                nums[index]=index+1;
                if(index<i)break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
