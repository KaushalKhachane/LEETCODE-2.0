class Solution {

    // found the non-circular subarray sum first
    public static int maxNormalSum(int[] nums) {
        int res = nums[0];
        int maxEnding = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int max_normal = maxNormalSum(nums);

        if (max_normal < 0) {
            return max_normal;
        }

        int arr_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr_sum = arr_sum + nums[i];
            nums[i] = -nums[i];
        }

        // substract the minimum circular sum sub array from the total sum of array
        int max_circular = arr_sum + maxNormalSum(nums);

        return Math.max(max_normal, max_circular);
    }

}