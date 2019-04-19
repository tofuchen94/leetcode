package com.leetcode.problem447;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 * Created by tofuchen on 2019/4/19.
 */
public class Solution {

    public int numberOfBoomerangs(int[][] points) {
        if(points==null||points.length<3)return 0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(j!=i){
                    int d=(int)(Math.pow(points[i][0]-points[j][0],2)+Math.pow(points[i][1]-points[j][1],2));
                    if(map.containsKey(d)){
                        map.put(d,map.get(d)+1);
                    }else{
                        map.put(d,1);
                    }
                }
            }
            for(Integer value:map.values()){
                if(value>1){
                    res+=value*(value-1);
                }
            }
            map.clear();
        }
        return res;
    }
}
