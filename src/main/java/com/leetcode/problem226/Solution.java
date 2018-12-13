package com.leetcode.problem226;

import com.leetcode.domain.TreeNode;

/**
 * 翻转二叉树
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode left=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(left);
        return root;
    }
}
