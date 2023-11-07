class Solution {
    public int countSubstrings(String s) {
        int size = s.length();
        boolean[][] dp = new boolean[size][size];

        int count = 0;

        for (int diff = 0; diff < size; diff++) {
            for (int i = 0, j = diff; j < size; i++, j++) {
                if (diff == 0) {
                    dp[i][j] = true;
                } else if (diff == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
                if (dp[i][j]) {
                    count++;
                }
            }
        }
        return count;