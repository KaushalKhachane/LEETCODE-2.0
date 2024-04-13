class Solution {
    public int solve(int index, int[] nums, int dp[]){
        // If the index is negative, there are no elements left to consider.
        if(index < 0){
            return 0;
        }
        // If the index is 0, there is only one element to consider, so return its value.
        if(index == 0){
            return nums[index];
        }

        if(dp[index] != -1){
            return dp[index];
        }
        // Calculate the maximum sum by either picking the current element or not picking it.
        int pick = nums[index] + solve(index-2, nums, dp);
        int notpick = 0 + solve(index-1, nums, dp);
        
        // Store the maximum of the two options in the dp array for future reference.
        return dp[index] = Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = solve(n-1, nums, dp);
        return res;
    }
     
} 