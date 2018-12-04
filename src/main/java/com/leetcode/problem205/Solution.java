package com.leetcode.problem205;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isIsomorphic(String s, String t) {
        if(s==null&&t==null)return true;
        if(s==null||t==null)return false;
        if(s.length()!=t.length())return false;
        Map<Character,Character> map1=new HashMap<Character,Character>();
        Map<Character,Character> map2=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++) {
        	char ch1=s.charAt(i);
        	char ch2=t.charAt(i);
        	if(map1.containsKey(ch1)) {
        		if(!map1.get(ch1).equals(ch2)) {
        			return false;
        		}
        	}else {
        		if(map2.containsKey(ch2))return false;
        		map1.put(ch1, ch2);
        		map2.put(ch2, ch1);
        	}
        }
        return true;
    }

}
