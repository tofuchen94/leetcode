package com.leetcode.problem437;

import com.leetcode.domain.TreeNode;

/**
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 * 找出路径和等于给定数值的路径总数。
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 * Created by tofuchen on 2019/4/16.
 */
public class Solution {

    public static void main(String[] args) {
        String tree="[10,5,-3,3,2,null,11,3,-2,null,1]";
        TreeNode root=TreeNode.stringToTreeNode(tree);
        System.out.println(new Solution().pathSum(root,8));
    }

    public int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        int res=0;
        res+=helper(root,sum);
        res+=pathSum(root.left,sum);
        res+=pathSum(root.right,sum);
        return res;
    }

    //以root开始的路径和为sum的数量
    private int helper(TreeNode root,int sum){
        if(root==null)return 0;
        int res=0;
        if(root.val==sum)res++;
        res+=helper(root.left,sum-root.val);
        res+=helper(root.right,sum-root.val);
        return res;
    }



}
