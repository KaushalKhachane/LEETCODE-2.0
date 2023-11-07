public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int left = 0, right = 0;
        int n = a.length;
        long sum = a[0];
        int maxLength = 0;

        while(right < n){
            while(left <= right && sum > k){
                sum -= a[left];
                left++;
            }

             // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
            if(right < n){
                sum += a[right];

                
            }
        }
        return maxLength;
    }
}