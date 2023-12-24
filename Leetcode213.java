class Solution {
    public int solve(int[] nums, int[] dp, int n){
    
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            int pick = nums[i];
            // If there are at least two elements before the current element,
            // add the value from dp[i-2].
            if (i > 1)
                pick += dp[i - 2];
            
            int notpick = dp[i-1];
            dp[i] = Math.max(pick, notpick);
        }

        return dp[n-1];
    }
    public int rob(int[] nums) {
       int n = nums.length;
       int arr1[] = new int[n];
       int arr2[] = new int[n];

       for(int i = 0; i < n; i++){
           if(i !=0){
               arr1[i] = nums[i];
           }
           if(i != n-1){
               arr2[i] = nums[i];
           }
       }

       int n1 = arr1.length;
       int dp1[] = new int[n1+1];
       int temp1 = solve(arr1, dp1, n1);

       
       int n2 = arr2.length;
       int dp2[] = new int[n2+1];
       int temp2 = solve(arr2, dp2, n2);

       return Math.max(temp1, temp2);
    }
}