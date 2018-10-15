package com.leetcode.problem107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.leetcode.domain.TreeNode;

/**
 * ����һ����������������ڵ�ֵ�Ե����ϵĲ�α����� ��������Ҷ�ӽڵ����ڲ㵽���ڵ����ڵĲ㣬���������ұ�����
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		if(root==null)return res;
		List<TreeNode> list1=new ArrayList<TreeNode>();
		list1.add(root);
		while(list1.size()>0) {
			List<TreeNode> list2=new ArrayList<TreeNode>();
			List<Integer> list=new ArrayList<Integer>();
			for(TreeNode node:list1) {
				list.add(node.val);
				if(node.left!=null)list2.add(node.left);
				if(node.right!=null)list2.add(node.right);
			}
			res.add(list);
			list1=list2;
		}
		Collections.reverse(res);
		return res;
	}

}
