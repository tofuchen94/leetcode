package com.leetcode.problem438;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * 说明：
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * Created by tofuchen on 2019/4/17.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().findAnagrams("cbaebabacd","abc"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<Integer>();
        if(s.length()<p.length())return res;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<p.length();i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(helper(arr1,arr2))res.add(0);
        for(int i=p.length();i<s.length();i++){
            arr2[s.charAt(i-p.length())-'a']--;
            arr2[s.charAt(i)-'a']++;
            if(helper(arr1,arr2))res.add(i-p.length()+1);
        }
        return res;
    }

    //判断两个记录字符数量的数组是否相等
    private boolean helper(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }
}
