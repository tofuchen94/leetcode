package com.leetcode.problem427;

/**
 * 我们想要使用一棵四叉树来储存一个 N x N 的布尔值网络。网络中每一格的值只会是真或假。树的根结点代表整个网络。对于每个结点, 它将被分等成四个孩子结点直到这个区域内的值都是相同的.
 * 每个结点还有另外两个布尔变量: isLeaf 和 val。isLeaf 当这个节点是一个叶子结点时为真。val 变量储存叶子结点所代表的区域的值。
 * 你的任务是使用一个四叉树表示给定的网络。
 * Created by tofuchen on 2019/4/15.
 */
public class Solution {

    public Node construct(int[][] grid) {
        return helper(grid,0,0,grid.length-1,grid.length-1);
    }

    private Node helper(int[][] grid,int lx,int ly,int rx,int ry){
        if(lx==rx&&ly==ry){
            Node res=new Node();
            res.isLeaf=true;
            if(grid[lx][ly]==1){
                res.val=true;
            }else{
                res.val=false;
            }
            return res;
        }
        int k=grid[lx][ly];
        boolean temp=true;
        for(int i=lx;i<=rx;i++){
            for(int j=ly;j<=ry;j++){
                if(grid[i][j]!=k)temp=false;
            }
        }

        if(temp){
            Node res=new Node();
            res.isLeaf=true;
            if(grid[lx][ly]==1){
                res.val=true;
            }else{
                res.val=false;
            }
            return res;
        }else{
            Node res=new Node();
            res.isLeaf=false;
            res.topLeft=helper(grid,lx,ly,(lx+rx)/2,(ly+ry)/2);
            res.topRight=helper(grid,lx,(ly+ry)/2+1,(lx+rx)/2,ry);
            res.bottomLeft=helper(grid,(lx+rx)/2+1,ly,rx,(ly+ry)/2);
            res.bottomRight=helper(grid,(lx+rx)/2+1,(ly+ry)/2+1,rx,ry);
            return res;
        }
    }
}

// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
