class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];

        // making the 1st column as 1 as only
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }

        // making that last row as 1 as only one way (move to right) to reach final goal
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }

        // calculating the ways by adding the down and right value to current dp[i][j]
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];

    
    }
}