package com.leetcode.problem235;

import com.leetcode.domain.TreeNode;
/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root==p||root==q)return root;
        if(helper(root.left,p)&&helper(root.left,q))return lowestCommonAncestor(root.left, p, q);
        if(helper(root.right,q)&&helper(root.right,p))return lowestCommonAncestor(root.right, p, q);
        return root;
    }
	
	private boolean helper(TreeNode root,TreeNode node) {
		if(root==null)return false;
		if(root==node)return true;
		return helper(root.right,node)||helper(root.left,node);
	}

}
