package simple;

import java.util.List;

/**
 * @apiNote 给定一个旋转排序数组，在原地恢复其排序。（升序）
 *        Example1: [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
 *        Example2:[6,8,9,1,2] -> [1,2,6,8,9]
 * @author zeekling
 * @version 1.0
 * @since 2019-12-14
 */
public class RecoverRotatedSortedArray {

	/**
     * @param nums: An integer array
     * @return: nothing
     */
	 public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int end = 0;
        for (int i=1; i<nums.size();i++ ){
            if (nums.get(i-1) > nums.get(i)){
                end = i;
                break;
            }
        }
        if (end == 0 || end == nums.size()){
            return;
        }
        for (int i=0;i<end;i++){
            nums.add(nums.get(i));
        }
        nums.subList(0, end).clear();
    }
}
