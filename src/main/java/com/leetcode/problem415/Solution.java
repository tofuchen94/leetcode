package com.leetcode.problem415;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * 注意：
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 *
 * Created by tofuchen on 2019/4/11.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("99","9"));
    }

    public String addStrings(String num1, String num2) {
        if(num1==null||num1.length()==0)return num2;
        if(num2==null||num2.length()==0)return num1;
        StringBuilder res=new StringBuilder();
        int k=0;
        int i=0;
        for(;i<num1.length()&&i<num2.length();i++){
            int n1=num1.charAt(num1.length()-i-1)-'0';
            int n2=num2.charAt(num2.length()-i-1)-'0';
            int sum=n1+n2+k;
            if(sum>9){
                res.append(sum%10);
                k=sum/10;
            }else{
                res.append(sum);
                k=0;
            }
        }
        if(i<num1.length()){
            k=helper(num1,i,res,k);
        }
        if(i<num2.length()){
            k=helper(num2,i,res,k);
        }
        if(k>0)res.append(k);
        return res.reverse().toString();
    }

    private int helper(String num,int i,StringBuilder res,int k){
        for(;i<num.length();i++){
            int n=num.charAt(num.length()-i-1)-'0';
            int sum=n+k;
            if(sum>9){
                res.append(sum%10);
                k=sum/10;
            }else{
                res.append(sum);
                k=0;
            }
        }
        return k;
    }
}
