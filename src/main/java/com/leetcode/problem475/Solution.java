package com.leetcode.problem475;

import java.util.Arrays;

/**
 * 冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
 * 现在，给出位于一条水平线上的房屋和供暖器的位置，找到可以覆盖所有房屋的最小加热半径。
 * 所以，你的输入将会是房屋和供暖器的位置。你将输出供暖器的最小加热半径。
 * 说明:
 * 1.给出的房屋和供暖器的数目是非负数且不会超过 25000。
 * 2.给出的房屋和供暖器的位置均是非负数且不会超过10^9。
 * 3.只要房屋位于供暖器的半径内(包括在边缘上)，它就可以得到供暖。
 * 4.所有供暖器都遵循你的半径标准，加热的半径也一样。
 * Created by tofuchen on 2019/5/24.
 */
public class Solution {

    public int findRadius(int[] houses, int[] heaters) {
        if(houses==null||houses.length==0)return 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res=0;
        for(int i=0,j=0;i<houses.length;i++){
            if(j==heaters.length-1){
                int temp=Integer.MAX_VALUE;
                temp=Math.min(temp,Math.abs(houses[i]-heaters[j]));
                if(j>0)temp=Math.min(temp,Math.abs(houses[i]-heaters[j-1]));
                res=Math.max(res,temp);
            }else{
                while(j<heaters.length-1&&houses[i]>=heaters[j])j++;
                int temp=Integer.MAX_VALUE;
                temp=Math.min(temp,Math.abs(houses[i]-heaters[j]));
                if(j>0)temp=Math.min(temp,Math.abs(houses[i]-heaters[j-1]));
                res=Math.max(res,temp);
            }
        }
        return res;
    }
}
