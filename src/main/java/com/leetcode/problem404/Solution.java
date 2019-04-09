package com.leetcode.problem404;

import com.leetcode.domain.TreeNode;

/**
 * 计算给定二叉树的所有左叶子之和。
 * Created by tofuchen on 2019/4/9.
 */
public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return 0;
        return helper(root,0);
    }

    private int helper(TreeNode root,int sign){
        if(root.left==null&&root.right==null){
            if(sign==0)return root.val;
            else return 0;
        }
        if(root.left!=null&&root.right!=null){
            return helper(root.left,0)+helper(root.right,1);
        }else if(root.left!=null){
            return helper(root.left,0);
        }else{
            return helper(root.right,1);
        }
    }
}
