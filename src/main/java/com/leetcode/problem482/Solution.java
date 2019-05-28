package com.leetcode.problem482;

/**
 * 给定一个密钥字符串S，只包含字母，数字以及 '-'（破折号）。N 个 '-' 将字符串分成了 N+1 组。给定一个数字 K，重新格式化字符串，
 * 除了第一个分组以外，每个分组要包含 K 个字符，第一个分组至少要包含 1 个字符。两个分组之间用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
 * 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
 * Created by tofuchen on 2019/5/28.
 */
public class Solution {

    public static void main(String[] args) {
        String s="2-5g-3-J";
        System.out.println(new Solution().licenseKeyFormatting(s,2));
    }

    public String licenseKeyFormatting(String S, int K) {
        if(S==null||S.length()==0)return null;
        S=S.toUpperCase();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='-')s.append(S.charAt(i));
        }
        if(s.length()==0)return "";
        int fl=0;
        if(s.length()%K==0)fl=K;
        else fl=s.length()%K;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();){
            for(int j=0;j<fl;j++){
                res.append(s.charAt(i+j));
            }
            res.append('-');
            i=i+fl;
            fl=K;
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
