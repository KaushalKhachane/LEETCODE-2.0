class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int cur = 0;
       int maxi = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == 1){
               cur++;
           }
           if(nums[i] == 0){
               cur = 0;
           }
           maxi = Math.max(cur,maxi);
       } 
       return maxi;
    }
}