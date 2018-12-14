package com.leetcode.problem232;

import java.util.Stack;
/**
 * ʹ��ջʵ�ֶ��е����в�����
 * push(x) -- ��һ��Ԫ�ط�����е�β����
 * pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء�
 * peek() -- ���ض����ײ���Ԫ�ء�
 * empty() -- ���ض����Ƿ�Ϊ�ա�
 * @author tofuchen
 *
 */
public class MyQueue {
	
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	/** Initialize your data structure here. */
    public MyQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.isEmpty()) {
        	while(!s1.isEmpty()) {
        		s2.push(s1.pop());
        	}
        }
        return s2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	if(s2.isEmpty()) {
        	while(!s1.isEmpty()) {
        		s2.push(s1.pop());
        	}
        }
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }

}
