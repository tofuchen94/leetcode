package com.leetcode.problem112;

import com.leetcode.domain.TreeNode;

/**
 * ����һ����������һ��Ŀ��ͣ��жϸ������Ƿ���ڸ��ڵ㵽Ҷ�ӽڵ��·��������·�������нڵ�ֵ��ӵ���Ŀ���
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null)return false;
		if(root.left==null&&root.right==null&&root.val==sum)return true;
		return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
	}

}
