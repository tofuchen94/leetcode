package com.leetcode.problem21;

import com.leetcode.domain.ListNode;

/**
 * ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode head=new ListNode(0);
        ListNode tail=head;
        while(l1!=null&&l2!=null) {
        	if(l1.val<l2.val) {
        		tail.next=l1;
        		tail=l1;
        		l1=l1.next;
        	}else {
        		tail.next=l2;
        		tail=l2;
        		l2=l2.next;
        	}
        }
        if(l1!=null) {
        	tail.next=l1;
        }else {
        	tail.next=l2;
        }
        return head.next;
    }

}
