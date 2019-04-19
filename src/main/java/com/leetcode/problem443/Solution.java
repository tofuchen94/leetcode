package com.leetcode.problem443;

/**
 * 给定一组字符，使用原地算法将其压缩。
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 在完成原地修改输入数组后，返回数组的新长度。
 *
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 * Created by tofuchen on 2019/4/19.
 */
public class Solution {

    public static void main(String[] args) {
        String str="aabbccc";
        char[] chars=str.toCharArray();
        new Solution().compress(chars);
        System.out.println(chars);
    }

    public int compress(char[] chars) {
        if(chars==null||chars.length==0)return 0;
        int index=0;
        int i=0;
        while(i<chars.length){
            int j=i;
            while(j<chars.length&&chars[j]==chars[i])j++;
            if(j-i==1){
                chars[index++]=chars[i];
            }else{
                chars[index++]=chars[i];
                String l=""+(j-i);
                for(int k=0;k<l.length();k++){
                    chars[index++]=l.charAt(k);
                }
            }
            i=j;
        }
        return index;
    }
}
