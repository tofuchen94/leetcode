package com.leetcode.problem455;

import java.util.Arrays;

/**
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，这是能让孩子们满足胃口的饼干的最小尺寸；
 * 并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 * 注意：
 * 你可以假设胃口值为正。
 * 一个小朋友最多只能拥有一块饼干。
 * Created by tofuchen on 2019/4/26.
 */
public class Solution {

    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1};
        System.out.println(new Solution().findContentChildren(g,s));
    }

    public int findContentChildren(int[] g, int[] s) {
        if(g==null||g.length==0||s==null||s.length==0)return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int[] helper=new int[s.length];
        if(s[0]<g[0])helper[0]=0;
        else helper[0]=1;

        for(int i=1;i<s.length;i++){
            if(s[i]<g[0]&&helper[i-1]==0)helper[i]=0;
            else helper[i]=1;
        }
        for(int i=1;i<g.length;i++){
            int[] temp=new int[s.length];
            for(int j=0;j<s.length;j++){
                if(j==0){
                    if(s[j]<g[i]&&helper[0]==0)temp[0]=0;
                    else temp[0]=1;
                }else{
                    if(s[j]<g[i])temp[j]=helper[j];
                    else{
                        temp[j]=Math.max(helper[j-1]+1,helper[j]);
                    }
                }
            }
            helper=temp;
        }
        return helper[s.length-1];
    }
}
