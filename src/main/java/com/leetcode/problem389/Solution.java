package com.leetcode.problem389;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * Created by tofuchen on 2019/4/4.
 */
public class Solution {

    public char findTheDifference(String s, String t) {
        if(s==null||s.length()==0)return t.charAt(0);
        int[] helper=new int[26];
        for(int i=0;i<s.length();i++){
            helper[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            helper[t.charAt(i)-'a']--;
        }
        for(int i=0;i<helper.length;i++){
            if(helper[i]==-1)return (char)(i+'a');
        }
        return 'a';
    }
}
