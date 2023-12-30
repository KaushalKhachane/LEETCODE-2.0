class Solution {
    public int helper(int i, int j, int m, int[][] matrix, int dp[][]){
        // below in out of boundry base case
        if(j < 0 || j >= m){
            return (int) Math.pow(10, 9); // A very large positive value to represent an invalid path
        }
        
        // below is the valid destination base case
        if(i == 0){
            return matrix[0][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = matrix[i][j] + helper(i-1, j, m, matrix, dp);
        int leftdig = matrix[i][j] + helper(i-1, j-1, m, matrix, dp);
        int rightdig = matrix[i][j] + helper(i-1, j+1, m, matrix, dp);

        // Store the maximum of the three paths in dp
        return dp[i][j] = Math.min(up, Math.min(leftdig, rightdig));

    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n][m];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }

        // int mini = Integer.MAX_VALUE;

        // // For each starting column, find the min path sum and update mini
        // for (int j = 0; j < m; j++) {
        //     int ans = helper(n - 1, j, m, matrix, dp);
        //     mini = Math.min(mini, ans);
        // }

        // return mini;

        // Tabulation //
        
        // Initializing the first row - base condition
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Calculate the maximum path sum for each cell in the matrix
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                int up = matrix[i][j] + dp[i - 1][j];

                int leftDiagonal = matrix[i][j];
                if(j - 1 >= 0){
                    leftDiagonal += dp[i - 1][j - 1];
                }else{
                    leftDiagonal += (int)Math.pow(10,9);
                }

                int rightDiagonal = matrix[i][j];
                if(j+ 1 < m){
                    rightDiagonal += dp[i - 1][j + 1];
                }else{
                    rightDiagonal += (int) Math.pow(10, 9);
                }

                // Store the min of the three paths in dp
                dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Find the maximum value in the last row of dp
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }

        return min;

    }
}