class Solution {
    public int maximumDifference(int[] nums) {
        if (nums.length < 2) {
            return -1; // Not enough elements to find a difference
        }

        int res = -1; // Initialize res to -1
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                res = Math.max(res, nums[i] - min);
            } else {
                min = nums[i];
            }
        }

        return res;
    }
}
