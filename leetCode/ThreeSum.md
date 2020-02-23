## 题目描述

给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

示例:

给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
```
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```

## 解题思路
![2020-01-19_21-44.png](https://img.zeekling.cn/images/2020/01/19/2020-01-19_21-44.png)

## 答案

```java
class Solution {
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
}
```
