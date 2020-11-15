package com.leetcode.list;

import java.text.DecimalFormat;
/**
 * 
 * 
给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
  
 示例 1：

输入：nums1 = [1,3], nums2 = [2]
输出：2.00000
解释：合并数组 = [1,2,3] ，中位数 2
示例 2：

输入：nums1 = [1,2], nums2 = [3,4]
输出：2.50000
解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
示例 3：

输入：nums1 = [0,0], nums2 = [0,0]
输出：0.00000
示例 4：

输入：nums1 = [], nums2 = [1]
输出：1.00000
示例 5：

输入：nums1 = [2], nums2 = []
输出：2.00000
题库位置：https://leetcode-cn.com/problems/median-of-two-sorted-arrays/

 * 
 * @author zeekling
 *
 */
public class FindMedianSortedArrays {
	
	public double median(int[] nums1, int[] nums2) {
        int all = nums1.length + nums2.length;
        int mi = 0,ni = 0, curr = 0, pre = 0;
        for ( int i = 0;i < all;i++ ) {
            pre = curr;
            if (mi < nums1.length && ni >= nums2.length ){
                curr = nums1[mi++];
            }else if (mi >= nums1.length && ni < nums2.length) {
                curr = nums2[ni++];
            }else {
                curr = nums1[mi] < nums2[ni] ? nums1[mi++] : nums2[ni++];
            }
            if (i*2 == all ){
                return ((double)curr + (double)pre)/2;
            }
            if ((i+1)*2 > all) {
                return curr;
            }
        }
        return 0;
    }
	
	public static void main(String[] args) {
		FindMedianSortedArrays median = new FindMedianSortedArrays();
		int[] nums1 = {2}, nums2 = {};
		double res = median.median(nums1, nums2);
		DecimalFormat format = new DecimalFormat("#.00000");
		System.out.println(format.format(res));
	}

}
