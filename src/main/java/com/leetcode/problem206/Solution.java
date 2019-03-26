package com.leetcode.problem206;

import com.leetcode.domain.ListNode;

/**
 * 反转一个单链表。
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode reverseList(ListNode head) {
        ListNode node=new ListNode(0);
        helper(node,head);
        return node.next;
    }
	
	private void helper(ListNode head,ListNode node) {
		if(node==null)return;
		ListNode next=node.next;
		node.next=head.next;
		head.next=node;
		helper(head,next);
	}

}
