package com.leetcode.problem20;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isValid(String s) {
		if(s==null||s.length()==0)return true;
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
			}else if(ch==')') {
				if(stack.isEmpty()||stack.peek()!='(') {
					return false;
				}else {
					stack.pop();
				}
			}else if(ch=='}') {
				if(stack.isEmpty()||stack.peek()!='{') {
					return false;
				}else {
					stack.pop();
				}
			}else if(ch==']') {
				if(stack.isEmpty()||stack.peek()!='[') {
					return false;
				}else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty())return true;
		return false;
	}

}
