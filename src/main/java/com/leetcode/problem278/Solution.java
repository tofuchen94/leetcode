package com.leetcode.problem278;

import com.leetcode.domain.VersionControl;
/**
 * �������� n ���汾 [1, 2, ..., n]�������ҳ�����֮�����а汾����ĵ�һ������İ汾��
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
