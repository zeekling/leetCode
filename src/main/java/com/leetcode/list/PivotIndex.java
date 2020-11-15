package com.leetcode.list;


/**
 * @file PivotIndex.java
 * @apiNote https://leetcode-cn.com/leetbook/read/array-and-string/yf47s/
 * @author zeekling
 * @version 1.0
 * @date 2020-08-16
 */
public class PivotIndex {


	public int pivotIndex(int[] nums){
		int sum = 0;
		int len = nums.length;
		for (int i=0; i< len;i++){
			sum += nums[i];
		}
		int leftSum = 0;
		for (int i = 0;i < len;i ++){

			if ((leftSum * 2 + nums[i]) == sum){
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = new int[]{1, 7, 3, 6, 5, 6};
		PivotIndex pro = new PivotIndex();
		int res = pro.pivotIndex(arr);
		System.out.println(res);
	}
}

