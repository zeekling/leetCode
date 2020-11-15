package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{

	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int min=0,mid=1, max=nums.length-1, s= 0;
        while(nums.length >= 3 && min < nums.length && nums[min] <= 0){
            mid = min + 1;
            max = nums.length-1;
            if(min > 0 && nums[min] == nums[min -1]){
                min ++;
                continue;
            }
            while(mid < max){
                s = nums[min] + nums[mid] + nums[max];
                if (s < 0){
                    mid ++;
                }else if(s > 0){
                    max --;
                }else if (s == 0){
                    res.add(Arrays.asList(nums[min],nums[mid], nums[max]));
                    while(mid < max && nums[mid] == nums[mid + 1]){
                        mid ++;
                    }
                    while(mid< max && nums[max] == nums[max-1]){
                        max --;
                    }
                    mid ++;
                    max --;
                }
            }
            min++;
        }
        return res;
    }

	public static void main(String[] args){
		ThreeSum sum = new ThreeSum();
		int[] arr = new int[]{0,0,0};
		List<List<Integer>> res = sum.threeSum(arr);
		for(List<Integer> list: res){
			for (Integer a: list){
				System.out.print(a + "\t");
			}
			System.out.println("");
		}
	}
}
