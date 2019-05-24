package com.leetcode.problem476;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 注意:给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * Created by tofuchen on 2019/5/24.
 */
public class Solution {

    public int findComplement(int num) {
        if(num==0)return 1;
        int res=0;
        int temp=1;
        while(num>0){
            if((num&1)==0){
                res+=temp;
            }
            temp*=2;
            num=num>>1;
        }
        return res;
    }
}
