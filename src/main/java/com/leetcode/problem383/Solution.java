package com.leetcode.problem383;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * Created by tofuchen on 2019/4/3.
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>0)return false;
        }
        return true;
    }
}
