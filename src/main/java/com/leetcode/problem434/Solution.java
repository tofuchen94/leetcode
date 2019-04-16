package com.leetcode.problem434;

/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * Created by tofuchen on 2019/4/16.
 */
public class Solution {

    public int countSegments(String s) {
        if(s==null)return 0;
        s=s.trim();
        if(s.length()==0)return 0;
        return s.split("( )+").length;
    }
}
