package simple;

/**
 * @apiNote 给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-29
 */
public class MinPathSum {
	/**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i=1;i<m;i++)
            dp[i][0] = dp[i-1][0] + grid[i][0];
        for(int j=1;j<n;j++)
            dp[0][j] = dp[0][j-1] + grid[0][j];
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
        return dp[m-1][n-1];
    }
}
