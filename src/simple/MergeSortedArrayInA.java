package simple;

/**
 * @apiNote 合并两个排序的整数数组A和B变成一个新的数组。
 * 样例
 * 样例 1:
 *
 * 输入：[1, 2, 3]  3  [4,5]  2
 * 输出：[1,2,3,4,5]
 * 解释:
 * 经过合并新的数组为[1,2,3,4,5]
 * 样例 2:
 *
 * 输入：[1,2,5] 3 [3,4] 2
 * 输出：[1,2,3,4,5]
 * 解释：
 * 经过合并新的数组为[1,2,3,4,5]
 * 注意事项
 * 你可以假设A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-16
 */
public class MergeSortedArrayInA {

	/*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] a, int m, int[] b, int n) {
        // write your code here
        int ia = m - 1,ib = n-1, il = m + n - 1;
        while (il>=0) {
            int min = 0;
            if(ia >= 0 && ib >= 0 && a[ia] >= b[ib]){
                min = a[ia--];
            }else if (ia>=0 && ib>= 0 && b[ib] > a[ia]){
                min = b[ib--];
            } else if (ia >=0 ){
                min = a[ia--];
            } else {
                min = b[ib--];
            }
            a[il--] = min;
        }
    }
}
