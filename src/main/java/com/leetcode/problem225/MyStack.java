package com.leetcode.problem225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ʹ�ö���ʵ��ջ�����в�����
 * push(x) -- Ԫ�� x ��ջ
 * pop() -- �Ƴ�ջ��Ԫ��
 * top() -- ��ȡջ��Ԫ��
 * empty() -- ����ջ�Ƿ�Ϊ��
 * @author tofuchen
 *
 */
public class MyStack {
	
	Queue<Integer> queue1;
	
	/** Initialize your data structure here. */
    public MyStack() {
        queue1=new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	Queue<Integer> queue2=new LinkedList<Integer>();
    	int pre=queue1.poll();
    	while(!queue1.isEmpty()) {
    		queue2.add(pre);
    		pre=queue1.poll();
    	}
    	queue1=queue2;
    	return pre;
    }
    
    /** Get the top element. */
    public int top() {
    	Queue<Integer> queue2=new LinkedList<Integer>();
    	int pre=queue1.poll();
    	while(!queue1.isEmpty()) {
    		queue2.add(pre);
    		pre=queue1.poll();
    	}
    	queue2.add(pre);
    	queue1=queue2;
    	return pre;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
