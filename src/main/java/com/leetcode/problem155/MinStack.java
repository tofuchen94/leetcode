package com.leetcode.problem155;

import java.util.ArrayList;
import java.util.List;

/**
 * ���һ��֧�� push��pop��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ
 * @author tofuchen
 *
 */
public class MinStack {
	
	List<Integer> list;
	List<Integer> minlist;
	
	
	/** initialize your data structure here. */
    public MinStack() {
    	list=new ArrayList<Integer>();
    	minlist=new ArrayList<Integer>();
    }
    
    public void push(int x) {
        list.add(x);
        if(minlist.isEmpty()||x<minlist.get(minlist.size()-1)) {
        	minlist.add(x);
        }else {
        	minlist.add(minlist.get(minlist.size()-1));
        }
    }
    
    public void pop() {
        minlist.remove(minlist.size()-1);
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return minlist.get(minlist.size()-1);
    }

}
