
class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int m = g.length;
        int n = g[0].length;

        if((g[0][0] == 1) || (g[m-1][n-1] == 1)){
            return 0;
        }

        int dp[][] = new int[m][n];
        dp[0][0] = 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(g[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    if(i > 0){
                    dp[i][j] += dp[i-1][j];
                }
                if(j > 0){
                    dp[i][j] += dp[i][j-1];
                }
                }
                
            }
        }

        return dp[m-1][n-1];

    
    }
}