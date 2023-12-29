import java.util.Arrays;

public class UniquePath {
    public static int countPaths(int i, int j, int dp[][]){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }


        int up = countPaths(i-1, j, dp);
        int left = countPaths(i,j-1, dp);

        return dp[i][j] = up + left;

    }
    public static void main(String[] args) {
        int m = 3;
        int n = 2;

        int dp[][] = new int[m][n];

        for(int r[] : dp){
            Arrays.fill(r, -1);
            // System.out.println(Arrays.toString(r));
        }
        // Call the countWays function and print the result
        System.out.println(countPaths(m-1, n-1, dp));
    }
}
