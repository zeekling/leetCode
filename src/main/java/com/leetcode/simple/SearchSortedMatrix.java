package com.leetcode.simple;

/**
 * 搜索二维矩阵
 * 
 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xmlwi1/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。 

 * @author zeekling
 * @version 1.0
 * @since 2019-12-14
 */
public class SearchSortedMatrix {

	/**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row=0,line=matrix.length-1, len=matrix[0].length;
        while(row < len && line >= 0){
            if(matrix[line][row] == target){
                return true;
            }
            if (matrix[line][row] < target){
                row ++;
            }else{
                line --;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchSortedMatrix searchSortedMatrix = new SearchSortedMatrix();
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        int target = 5;
        boolean res = searchSortedMatrix.searchMatrix(matrix, target);
        System.out.println(res ? "存在" : "不存在");
    }
}
