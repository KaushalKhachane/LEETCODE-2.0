class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int end = n - 1;
        int ans = n;
        while(low <= end){
            int mid = low + (end - low) / 2;
            if(nums[mid] >= target){
                ans = mid;
                end = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}