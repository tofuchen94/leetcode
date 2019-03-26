package com.leetcode.problem110;

import com.leetcode.domain.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean isBalanced(TreeNode root) {
		if(helper(root)<0)return false;
		return true;
	}
	
	private int helper(TreeNode root) {
		if(root==null)return 0;
		int left=helper(root.left);
		int right=helper(root.right);
		if(left==-1||right==-1)return -1;
		if(Math.abs(left-right)>1)return -1;
		return Math.max(left, right)+1;
	}
}
