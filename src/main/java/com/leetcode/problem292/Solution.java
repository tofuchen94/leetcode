package com.leetcode.problem292;

/**
 * 你和你的朋友，两个人一起玩 Nim游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
 * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
 * Created by tofuchen on 2019/3/27.
 */
public class Solution {

    public static void main(String[] args){
        System.out.println(new Solution().canWinNim(1348820612));
    }

    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}
