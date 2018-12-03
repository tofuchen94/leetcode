package com.leetcode.problem203;

import com.leetcode.domain.ListNode;
/**
 * ɾ�������е��ڸ���ֵ val �����нڵ�
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode removeElements(ListNode head, int val) {
        ListNode head1=new ListNode(0);
        head1.next=head;
        ListNode pre=head1;
        while(head!=null) {
        	if(head.val==val)head=removeNode(pre, head);
        	else {
        		pre=head;
        		head=head.next;
        	}
        }
        return head1.next;
    }
	
	public ListNode removeNode(ListNode pre,ListNode node) {
		pre.next=node.next;
		node=null;
		return pre.next;
	}

}
