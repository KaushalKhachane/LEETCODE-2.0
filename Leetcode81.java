class Solution {
    public boolean search(int[] nums, int k) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == k){
                return true;
            }

            //Edge case:
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            //if left part is sorted:
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= k && k <= nums[mid]) {
                    //element exists:
                    high = mid - 1;
                } else {
                    //element does not exist:
                    low = mid + 1;
                }
            } else { //if right part is sorted:
                if (nums[mid] <= k && k <= nums[high]) {
                    //element exists:
                    low = mid + 1;
                } else {
                    //element does not exist:
                    high = mid - 1;
                }
            }
        }
        return false;

    }
}