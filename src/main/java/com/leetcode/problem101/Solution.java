package com.leetcode.problem101;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.domain.TreeNode;

/**
 * ����һ����������������Ƿ��Ǿ���ԳƵ�
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
//	//�ݹ�
//	public boolean isSymmetric(TreeNode root) {
//		if(root==null)return true;
//		return helper1(root.left,root.right);
//	}
//	
//	//�ж�root1��root2�Ƿ�Գ�
//	private boolean helper1(TreeNode root1,TreeNode root2) {
//		if(root1==null&&root2==null)return true;
//		if(root1==null||root2==null)return false;
//		if(root1.val!=root2.val)return false;
//		return helper1(root1.left,root2.right)&&helper1(root1.right,root2.left);
//	}
	
	//�ǵݹ�
	public boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode root1=queue.poll();
			TreeNode root2=queue.poll();
			if(root1==null&&root2==null)continue;
			if(root1==null||root2==null)return false;
			if(root1.val!=root2.val)return false;
			queue.add(root1.left);
			queue.add(root2.right);
			queue.add(root1.right);
			queue.add(root2.left);
		}
		return true;
	}
	
}
