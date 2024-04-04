class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, zero = 0;
        int lent = 0, maxlen = 0;

        while(right < nums.length){
            if(nums[right] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            
            if(zero <= k){
                lent = right - left + 1;
                maxlen = Math.max(maxlen, lent);
            }
            right++;
        }
        return maxlen;
    }
}