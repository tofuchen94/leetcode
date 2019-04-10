package com.leetcode.problem412;

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3. 如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * Created by tofuchen on 2019/4/10.
 */
public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<String>(n);
        int nextf=3,nextb=5;
        for(int i=1;i<=n;i++){
            if(i==nextb&&i==nextf){
                res.add("FizzBuzz");
                nextf+=3;
                nextb+=5;
            }else if(i!=nextf&&i!=nextb){
                res.add(Integer.toString(i));
            }else if(i==nextf){
                res.add("Fizz");
                nextf+=3;
            }else{
                res.add("Buzz");
                nextb+=5;
            }
        }
        return res;
    }

}
