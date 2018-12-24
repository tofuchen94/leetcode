package com.leetcode.problem237;

import com.leetcode.domain.ListNode;

/**
 * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
 * @author tofuchen
 *
 */
public class Solution {
	
	public void deleteNode(ListNode node) {
        ListNode pre=node;
        ListNode now=node.next;
        while(now.next!=null) {
        	pre.val=now.val;
        	pre=now;
        	now=now.next;
        }
        pre.val=now.val;
        pre.next=null;
	}
}
