package com.leetcode.problem111;

import com.leetcode.domain.TreeNode;

/**
 * 给定一个二叉树，找出其最小深度。最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public int minDepth(TreeNode root) {
		if(root==null)return 0;
		if(root.left==null&&root.right==null)return 1;
		if(root.left==null)return minDepth(root.right)+1;
		if(root.right==null)return minDepth(root.left)+1;
		return Math.min(minDepth(root.left), minDepth(root.right))+1;
	}
}
