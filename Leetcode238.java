class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // space complexity O(1)
        // time complexity O(n)
        int[] res = new int[n];

        // product before first and last element is considered as 1
        int productOfAllBeforeCurrent = 1;
        int productOfAllAfterCurrent = 1;

        for (int i = 0; i < n; i++) {
            res[i] = productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= productOfAllAfterCurrent;
            productOfAllAfterCurrent *= nums[i];
        }

        // return res array
        return res;
    }
}