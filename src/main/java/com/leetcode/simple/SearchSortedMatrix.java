package com.leetcode.simple;

/**
 * @apiNote 写出一个高效的算法来搜索 m × n矩阵中的值。这个矩阵具有以下特性：
 *          每行中的整数从左到右是排序的。
 *          每行的第一个数大于上一行的最后一个整数。
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
}
