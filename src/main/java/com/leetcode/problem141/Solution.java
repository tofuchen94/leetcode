package com.leetcode.problem141;

import com.leetcode.domain.ListNode;

/**
 * ����һ�������ж��������Ƿ��л�
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean hasCycle(ListNode head) {
		if(head==null||head.next==null)return false;
		ListNode slow=head;
		ListNode fast=head.next.next;
		while(fast!=null&&fast.next!=null) {
			if(fast==slow)return true;
			slow=slow.next;
			fast=fast.next.next;
		}
		return false;
	}
}
