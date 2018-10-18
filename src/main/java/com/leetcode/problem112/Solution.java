package com.leetcode.problem112;

import com.leetcode.domain.TreeNode;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和
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
