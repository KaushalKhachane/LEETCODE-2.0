class Solution {
    public int helper(String a, String b, int a1, int b1, int dp[][]){
        if(a1 < 0 || b1 < 0){
            return 0;
        }

        if(dp[a1][b1] != -1){
            return dp[a1][b1];
        }

       if (a.charAt(a1) == b.charAt(b1)) {
            return dp[a1][b1] = 1 + helper(a, b, a1 - 1, b1 - 1, dp);
        } else {
            return dp[a1][b1] = Math.max(helper(a, b, a1, b1 - 1, dp),
                           helper(a, b, a1 - 1, b1, dp));
        }    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n][m];

        for(int row[]: dp){
            Arrays.fill(row,-1);
        }

        return helper(text1, text2, text1.length()-1, text2.length()-1, dp);
    }
}