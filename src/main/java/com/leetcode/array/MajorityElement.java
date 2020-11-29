package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;
/**
 * 多数元素
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

示例 1:

输入: [3,2,3]
输出: 3
示例 2:

输入: [2,2,1,1,1,2,2]
输出: 2

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xm77tm/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer counter = map.getOrDefault(nums[i], 0);
            counter ++;
            map.put(nums[i], counter);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();

        int[] nums = {2,2,1,1,1,2,2};

        int res = majorityElement.majorityElement(nums);

        System.out.println(res);
        
    }
}
