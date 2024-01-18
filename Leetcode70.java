public class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        
        return one;
    }
}


// class Solution {
//     public int helper(int n, int dp[]){
//         if(n < 0){
//             return 0;
//         }

//         if(n == 0){
//             return 1;
//         }
//         if(dp[n] != -1){
//             return dp[n];
//         }
        
//         int one = helper(n-1, dp);
//         int two = helper(n-2, dp);

//         return dp[n] = one + two;
//     }
//     public int climbStairs(int n) {
//         int dp[] = new int[n+1];
//         Arrays.fill(dp, -1);
//         return helper(n, dp);
//     }
// }