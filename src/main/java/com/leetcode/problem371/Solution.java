package com.leetcode.problem371;

/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和
 * 思路：a+b的和与a1+b1的和相同
 * Created by tofuchen on 2019/4/2.
 */
public class Solution {

    public int getSum(int a, int b) {
        int a1=a^b;
        int b1=(a&b)<<1;
        if(b1!=0){
            return getSum(a1,b1);
        }
        return a1;
    }
}
