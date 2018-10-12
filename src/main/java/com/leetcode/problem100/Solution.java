package com.leetcode.problem100;

import com.leetcode.domain.TreeNode;

/**
 * ������������������дһ�����������������Ƿ���ͬ�� ����������ڽṹ����ͬ�����ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null)return true;
		if(p!=null&&q==null)return false;
		if(p==null&&q!=null)return false;
		if(p.val!=q.val)return false;
		return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	}
}
