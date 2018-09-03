package com.tofuchen.domain;

/**
 * @author tofuchen
 * @date 2018/9/3 15:38
 * 二叉树节点定义
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
