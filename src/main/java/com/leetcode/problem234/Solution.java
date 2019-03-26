package com.leetcode.problem234;
/**
 * 请判断一个链表是否为回文链表
 * @author tofuchen
 *
 */

import com.leetcode.domain.ListNode;
public class Solution {
	
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		System.out.println(new Solution().isPalindrome(head));
	}
	
	public boolean isPalindrome(ListNode head) {
		if(head==null||head.next==null)return true;
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        ListNode slow=newHead;
        ListNode fast=newHead;
        while(fast.next!=null&&fast.next.next!=null) {
        	slow=slow.next;
        	fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        fast=slow.next;
        head=newHead.next;
        while(fast!=null&&head!=slow.next) {
        	if(fast.val!=head.val)return false;
        	fast=fast.next;
        	head=head.next;
        }
        return true;
    }
	
	private ListNode reverse(ListNode node) {
		ListNode head=new ListNode(0);
		while(node!=null) {
			ListNode next=node.next;
			node.next=head.next;
			head.next=node;
			node=next;
		}
		return head.next;
	}

}
