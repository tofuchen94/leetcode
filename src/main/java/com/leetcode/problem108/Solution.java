package com.leetcode.problem108;

import com.leetcode.domain.TreeNode;
/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null||nums.length==0)return null;
		return helper(nums,0,nums.length-1);
	}
	
	private TreeNode helper(int[] nums,int left,int right) {
		if(left>right)return null;
		if(left==right)return new TreeNode(nums[left]);
		int mid=(left+right)/2;
		TreeNode res=new TreeNode(nums[mid]);
		res.left=helper(nums,left,mid-1);
		res.right=helper(nums,mid+1,right);
		return res;
	}
}
