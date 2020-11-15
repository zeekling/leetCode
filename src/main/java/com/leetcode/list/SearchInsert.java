package com.leetcode.list;

/**
 * @file SearchInsert.java
 * @apiNote https://leetcode-cn.com/problems/search-insert-position/submissions/
 * @author zeekling
 * @version 1.0
 * @date 2020-08-16
 */
public class SearchInsert {

	public int searchInsert(int[] nums, int target){
		int len = nums.length;
		for(int i=0;i<len;i++){
			if (nums[i] >= target){
				return i;
			}
		}
		return len;
	}

	public static void main(String args[]){
		SearchInsert s = new SearchInsert();
		int[] arr = new int[]{1, 3, 5, 6};
		System.out.println(s.searchInsert(arr, 5));
		System.out.println(s.searchInsert(arr, 2));
		System.out.println(s.searchInsert(arr, 7));
		System.out.println(s.searchInsert(arr, 0));
	}
}
