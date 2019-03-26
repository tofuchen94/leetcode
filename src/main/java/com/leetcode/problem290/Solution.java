package com.leetcode.problem290;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 * 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 * Created by tofuchen on 2019/3/26.
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        if(pattern.length()!=strs.length)return false;
        Map<Character,String> map1=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i))){
                if(!strs[i].equals(map1.get(pattern.charAt(i)))){
                    return false;
                }
            }else {
                if (map1.containsValue(strs[i])) {
                    return false;
                } else {
                    map1.put(pattern.charAt(i), strs[i]);
                }
            }
        }
        return true;
    }
}
