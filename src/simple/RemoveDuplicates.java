package simple;

/**
 * @apiNote 给定一个排序数组，在原数组中“删除”重复出现的数字，使得每个元素只出现一次，并且返回“新”数组的长度。
 *       不要使用额外的数组空间，必须在不使用额外空间的条件下原地完成。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-28
 */
public class RemoveDuplicates {
	/*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int tmp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[tmp]){
                tmp++;
                nums[tmp] = nums[i];
            }
        }
        return tmp + 1;
    }
}
