package com.leetcode.problem500;

import java.util.*;

/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 * Created by tofuchen on 2019/6/3.
 */
public class Solution {

    public static void main(String[] args) {
        String[] words={"qwee"};
        System.out.println(Arrays.toString(new Solution().findWords(words)));
    }

    static Set<Character> set1;
    static Set<Character> set2;
    static Set<Character> set3;

    public String[] findWords(String[] words) {
        if(words==null||words.length==0)return new String[0];
        List<String> list=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            if(words[i]==null||words[i].length()<2){
                list.add(words[i]);
                continue;
            }
            Set<Character> set;
            if(set1.contains(words[i].charAt(0)))set=set1;
            else if(set2.contains(words[i].charAt(0)))set=set2;
            else set=set3;
            boolean temp=true;
            for(int j=0;j<words[i].length();j++){
                if(!set.contains(words[i].charAt(j))){
                    temp=false;
                }
            }
            if(temp)list.add(words[i]);
        }
        String[] res=new String[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }


    static{
        set1=new HashSet<Character>();
        set2=new HashSet<Character>();
        set3=new HashSet<Character>();
        helper("qwertyuiop",set1);
        helper("asdfghjkl",set2);
        helper("zxcvbnm",set3);
    }

    private static void helper(String str,Set<Character> set){
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
    }
}
