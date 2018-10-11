package com.leetcode.problem83;

import com.leetcode.domain.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
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
