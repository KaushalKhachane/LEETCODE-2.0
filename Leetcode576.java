class Solution {
    private static final int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
        return findPathsHelper(m, n, maxMove, startRow, startColumn, dp);
    }

    private int findPathsHelper(int m, int n, int maxMove, int row, int col, int[][][] dp) {
        // Base case: out of bounds
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1;
        }

        // Base case: maximum moves reached
        if (maxMove == 0) {
            return 0;
        }

        // Check if result for current state is already calculated
        if (dp[row][col][maxMove] != 0) {
            return dp[row][col][maxMove];
        }

        int paths = 0;

        // Calculate the number of paths for the current state
        paths = (
            (paths + findPathsHelper(m, n, maxMove - 1, row - 1, col, dp)) % MOD +
            (paths + findPathsHelper(m, n, maxMove - 1, row + 1, col, dp)) % MOD +
            (paths + findPathsHelper(m, n, maxMove - 1, row, col - 1, dp)) % MOD +
            (paths + findPathsHelper(m, n, maxMove - 1, row, col + 1, dp)) % MOD
        ) % MOD;

        // Memoize the result
        dp[row][col][maxMove] = paths;

        return paths;
    }
}
