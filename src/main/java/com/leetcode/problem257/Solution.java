package com.leetcode.problem257;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.domain.TreeNode;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径
 * @author tofuchen
 *
 */
public class Solution {
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<String>();
        if(root==null)return res;
        List<Integer> pres=new ArrayList<Integer>();
        helper(res,pres,root);
        return res;
    }
	
	private void helper(List<String> res,List<Integer> pres,TreeNode now) {
		pres.add(now.val);
		if(now.left==null&&now.right==null) {
			res.add(toString(pres));
		}else {
			if(now.left!=null) {
				helper(res,pres,now.left);
			}
			if(now.right!=null) {
				helper(res,pres,now.right);
			}
		}
		pres.remove(pres.size()-1);
		return;
	}
	
	private String toString(List<Integer> list) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			if(i<list.size()-1) {
				res.append(list.get(i));
				res.append("->");
			}else {
				res.append(list.get(i));
			}
		}
		return res.toString();
	}

}
