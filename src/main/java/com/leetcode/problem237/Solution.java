package com.leetcode.problem237;

import com.leetcode.domain.ListNode;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
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
