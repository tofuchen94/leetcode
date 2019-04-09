package com.leetcode.problem405;

/**
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 * 注意:
 * 十六进制中所有字母(a-f)都必须是小写。
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
 *
 * Created by tofuchen on 2019/4/9.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().toHex(26));
    }

    public String toHex(int num) {
        if(num==0) return "0";
        int[] array;
        if(num>0)array=helper1(num);
        else array=helper2(num);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<32;i+=4){
            int k=0;
            for(int j=0;j<4;j++){
                k=k*2+array[i+j];
            }
            if(k==0&&res.length()==0){
                continue;
            }else{
                if(k>9){
                    res.append((char)('a'+k-10));
                }else{
                    res.append(k);
                }
            }
        }
        return res.toString();
    }

    //将正数转换为二进制数组
    private int[] helper1(int num){
        int[] res=new int[32];
        int i=0;
        while(i<32&&num>0){
            res[31-i]=num%2;
            num=num/2;
            i++;
        }
        return res;
    }

    //将负数转换为二进制数组
    private int[] helper2(int num){
        int[] res=helper1(-num);
        res[0]=1;
        int temp=1;
        for(int i=31;i>0;i--){
            res[i]=1-res[i];
            if(temp==1&&res[i]==1){
                res[i]=0;
            }else{
                res[i]+=temp;
                temp=0;
            }
        }
        return res;
    }
}
