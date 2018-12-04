package com.leetcode.problem205;

import java.util.HashMap;
import java.util.Map;

/**
 * ���������ַ��� s �� t���ж������Ƿ���ͬ���ġ���� s �е��ַ����Ա��滻�õ� t ����ô�������ַ�����ͬ���ġ�
 * ���г��ֵ��ַ�����������һ���ַ��滻��ͬʱ�����ַ���˳�������ַ�����ӳ�䵽ͬһ���ַ��ϣ����ַ�����ӳ���Լ�����
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
