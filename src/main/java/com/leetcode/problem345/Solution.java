package com.leetcode.problem345;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母
 * Created by tofuchen on 2019/3/30.
 */
public class Solution {

    static Set<Character> vowelSet;
    static{
        vowelSet=new HashSet<Character>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');
    }

    public String reverseVowels(String s) {
        if(s==null||s.length()<=1)return s;
        char[] chs=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<chs.length&&!vowelSet.contains(chs[i]))i++;
            while(j>=0&&!vowelSet.contains(chs[j]))j++;
            if(i<j){
                swap(chs,i++,j--);
            }
        }
        StringBuilder res=new StringBuilder();
        for(i=0;i<chs.length;i++){
            res.append(chs[i]);
        }
        return res.toString();
    }

    private void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
