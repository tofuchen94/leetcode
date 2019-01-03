package com.leetcode.problem278;

import com.leetcode.domain.VersionControl;
/**
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * @author tofuchen
 *
 */
public class Solution extends VersionControl {

	public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        while(left<right) {
        	int mid=left+(right-left)/2;
        	if(isBadVersion(mid)){
        		right=mid;
        	}else {
        		left=mid+1;
        	}
        }
        return left;
    }

}
