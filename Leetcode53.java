class Solution {
    public int maxSubArray(int[] nums) {
        int maxi =  Integer.MIN_VALUE   ;
        int sum = 0;

        // below's three variable for printing the max-sumarray which give max value
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;

        for(int i = 0; i < nums.length; i++){
            // if ssum = 0 then start sub-array from it's next item
            if(sum == 0) start = i;
            sum = sum + nums[i];
         
            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }   
        }
       
       for(int j = ansStart; j <= ansEnd; j++){
           System.out.print(" "+nums[j]);
       }

        return maxi;
    }
}