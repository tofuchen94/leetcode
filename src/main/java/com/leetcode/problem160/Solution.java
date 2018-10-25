package com.leetcode.problem160;

import com.leetcode.domain.ListNode;

/**
 * ��дһ�������ҵ������������ཻ����ʼ�ڵ㡣
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int al=0;
		for(ListNode node=headA;node!=null;node=node.next)al++;
		int bl=0;
		for(ListNode node=headB;node!=null;node=node.next)bl++;
		if(al<bl) {
			for(int i=0;i<bl-al;i++)headB=headB.next;
		}else {
			for(int i=0;i<al-bl;i++)headA=headA.next;
		}
		while(headA!=headB) {
			headA=headA.next;
			headB=headB.next;
		}
		return headA;
	}
}
