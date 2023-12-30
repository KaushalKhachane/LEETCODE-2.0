
class Solution {
    static int mazeObstaclesUtil(int i, int j, int[][] maze, int[][] dp) {
        // If there's an obstacle at this cell or out of bounds, return 0
        if (i >= 0 && j >= 0 && maze[i][j] == 1)
            return 0;
        // If we've reached the start cell, there's one valid path
        if (i == 0 && j == 0)
            return 1;
        // If we're out of bounds, return 0
        if (i < 0 || j < 0)
            return 0;
        // If we've already calculated this cell, return the stored result
        if (dp[i][j] != -1)
            return dp[i][j];

        // Calculate the number of paths by moving up and left
        int up = mazeObstaclesUtil(i - 1, j, maze, dp);
        int left = mazeObstaclesUtil(i, j - 1, maze, dp);

        // Store the result and return it
        return dp[i][j] = up + left;
    }

    int mazeObstacles(int n, int m, int[][] maze) {
        int dp[][] = new int[n][m];
        
        // Initialize the dp array with -1
        for (int row[] : dp)
            Arrays.fill(row, -1);
        
        // Call the helper function starting from the bottom-right cell
        return mazeObstaclesUtil(n - 1, m - 1, maze, dp);
    }

    public int uniquePathsWithObstacles(int[][] g) {
        // int m = g.length;
        // int n = g[0].length;

        // if((g[0][0] == 1) || (g[m-1][n-1] == 1)){
        //     return 0;
        // }

        // int dp[][] = new int[m][n];
        // dp[0][0] = 1;

        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(g[i][j] == 1){
        //             dp[i][j] = 0;
        //         }else{
        //             if(i > 0){
        //             dp[i][j] += dp[i-1][j];
        //         }
        //         if(j > 0){
        //             dp[i][j] += dp[i][j-1];
        //         }
        //         }
                
        //     }
        // }

        // return dp[m-1][n-1];

        return mazeObstacles(g.length, g[0].length, g);
        

    
    }
}