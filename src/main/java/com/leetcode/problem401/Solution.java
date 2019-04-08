package com.leetcode.problem401;

import java.util.*;

/**
 * 二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 * 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 * Created by tofuchen on 2019/4/8.
 */
public class Solution {

    private static  Map<Integer,Set<Integer>> map;
    static{
        map=new HashMap<Integer, Set<Integer>>();
        for(int i=0;i<60;i++){
            int count=0;
            for(int j=0;j<6;j++){
                if(((i>>j)&1)==1)count++;
            }
            if(map.containsKey(count)){
                map.get(count).add(i);
            }else{
                Set<Integer> set=new HashSet<Integer>();
                set.add(i);
                map.put(count,set);
            }
        }
    }

    public List<String> readBinaryWatch(int num) {
        List<String> res=new ArrayList<String>();
        for(int h=0;h<=num;h++){
            if(map.containsKey(h)&&map.containsKey(num-h)){
                Set<Integer> hset=map.get(h);
                Set<Integer> mset=map.get(num-h);
                for(Integer hour:hset){
                    if(hour<12){
                        for(Integer m:mset){
                            res.add(helper(hour,m));
                        }
                    }
                }
            }
        }
        return res;
    }

    private String helper(int h,int m){
        StringBuilder res=new StringBuilder();
        res.append(h);
        res.append(":");
        if(m<10){
            res.append("0");
        }
        res.append(m);
        return res.toString();
    }

}
