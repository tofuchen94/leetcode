package com.leetcode.problem459;

/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * Created by tofuchen on 2019/4/26.
 */
public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        if(s==null||s.length()==0)return false;
        if(s.length()==1)return false;
        for(int i=2;i<=s.length();i++){
            if(s.length()%i==0&&helper(s,s.length()/i)){
                return true;
            }
        }
        return false;
    }

    private boolean helper(String s,int l){
        for(int i=0;i<l;i++){
            for(int k=1;i+k*l<s.length();k++){
                if(s.charAt(i+k*l)!=s.charAt(i))return false;
            }
        }
        return true;
    }

}
