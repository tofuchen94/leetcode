package com.leetcode.problem104;

import com.leetcode.domain.TreeNode;

/**
 * ����һ�����������ҳ��������ȡ������������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public int maxDepth(TreeNode root) {
		if(root==null)return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	}

}
