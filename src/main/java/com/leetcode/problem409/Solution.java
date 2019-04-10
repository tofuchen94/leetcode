package com.leetcode.problem409;

/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * Created by tofuchen on 2019/4/10.
 */
public class Solution {

    public int longestPalindrome(String s) {
        if(s==null||s.length()==0)return 0;
        if(s.length()==1)return 1;
        int[] helper=new int[52];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                helper[ch-'a']++;
            }else{
                helper[ch-'A'+26]++;
            }
        }
        int res=0;
        int sign=0;
        for(int i=0;i<helper.length;i++){
            res+=2*(helper[i]/2);
            if(helper[i]%2==1)sign=1;
        }
        res+=sign;
        return res;
    }
}
