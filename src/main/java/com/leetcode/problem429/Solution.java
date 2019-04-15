package com.leetcode.problem429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 * Created by tofuchen on 2019/4/15.
 */
public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null)return res;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<Integer>();
            Queue<Node> q=new LinkedList<Node>();
            while(!queue.isEmpty()){
                Node node=queue.poll();
                list.add(node.val);
                for(int i=0;i<node.children.size();i++){
                    q.add(node.children.get(i));
                }
            }
            res.add(list);
            queue=q;
        }
        return res;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
