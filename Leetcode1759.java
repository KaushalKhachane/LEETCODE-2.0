class Solution {
    public int countHomogenous(String s) {
        int m;

        if(s.length() == 0) return 0;

        int dp[] = new int[s.length()];

        dp[0] = 1;
        long res = 1; // Use long to avoid overflow

        for(int i = 1; i < s.length(); i++){
            dp[i] = 1;
            if(s.charAt(i) == s.charAt(i-1)){
                dp[i] = dp[i-1] +1;
            }

            res = (res + dp[i]) % 1_000_000_007; // Keep the result within bounds
        }

        return (int) res;
    }
}
