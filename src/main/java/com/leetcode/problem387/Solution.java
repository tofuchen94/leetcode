package com.leetcode.problem387;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 * Created by tofuchen on 2019/4/4.
 */
public class Solution {

    public int firstUniqChar(String s) {
        if(s==null||s.length()==0)return -1;
        if(s.length()==1)return 0;
        int[] helper=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(helper[i]==0){
                int count=1;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)==s.charAt(i)){
                        count++;
                        helper[j]=1;
                    }
                }
                if(count==1)return i;
            }
        }
        return -1;
    }
}
