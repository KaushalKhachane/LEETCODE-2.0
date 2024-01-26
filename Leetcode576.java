=import java.util.Arrays;

class Solution {
    private final int mod = 1000000007;
    private final int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private int[][][] dp;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[51][51][51];
        for (int[][] arr2D : dp) {
            for (int[] arr1D : arr2D) {
                Arrays.fill(arr1D, -1);
            }
        }
        return f(startRow, startColumn, m, n, maxMove);
    }

    private int f(int i, int j, int m, int n, int remMoves) {
        // Base cases
        if (i == m || j == n || i == -1 || j == -1) return 1;
        if (remMoves == 0) return 0;
        if (dp[i][j][remMoves] != -1) return dp[i][j][remMoves];

        int ans = 0;
        for (int[] dir : dirs) {
            int dx = dir[0];
            int dy = dir[1];
            ans += f(i + dx, j + dy, m, n, remMoves - 1);
            ans %= mod;
        }

        return dp[i][j][remMoves] = ans;
    }
}
