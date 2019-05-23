package com.leetcode.problem463;

/**
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 * Created by tofuchen on 2019/5/23.
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)return helper(grid,i,j);
            }
        }
        return 0;
    }
    //从i,j出发计算每一个相连陆地的岸边界长度，将计算过的陆地设置为2
    private int helper(int[][] grid,int i,int j){
        int res=0;
        grid[i][j]=2;
        if(i-1==-1||grid[i-1][j]==0)res++;
        else if(grid[i-1][j]==1){
            res+=helper(grid,i-1,j);
        }

        if(j+1==grid[0].length||grid[i][j+1]==0)res++;
        else if(grid[i][j+1]==1){
            res+=helper(grid,i,j+1);
        }

        if(i+1==grid.length||grid[i+1][j]==0)res++;
        else if(grid[i+1][j]==1){
            res+=helper(grid,i+1,j);
        }

        if(j-1==-1||grid[i][j-1]==0)res++;
        else if(grid[i][j-1]==1){
            res+=helper(grid,i,j-1);
        }

        return res;
    }
}
