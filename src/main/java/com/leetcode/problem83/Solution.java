package com.leetcode.problem83;

import com.leetcode.domain.ListNode;

/**
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)return head;
		ListNode tail=head;
		ListNode now=head.next;
		while(now!=null){
			if(now.val==tail.val)now=now.next;
			else {
				tail.next=now;
				tail=now;
				now=now.next;
			}
		}
		tail.next=null;
		return head;
	}
}
