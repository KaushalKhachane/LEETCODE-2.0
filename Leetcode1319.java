class Solution {
    public int maxProductDifference(int[] nums) {
        if (nums.length < 4) {
            // Handle the case when the array has less than four elements
            return 0; // Or throw an exception, depending on your requirements
        }

        // Arrays.sort(nums); // Sort the array in ascending order

        // int n = nums.length;

        // // Calculate the maximum product difference
        // int maxProductDiff = (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);

        // return maxProductDiff;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num: nums){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2){
                max2 = num;
            }

            if(num < min1){
                min2 = min1;
                min1 = num;
            }else if(num < min2){
                min2 = num;
            }
        }

        // Calculate the maximum product difference
        int maxProductDiff = (max1 * max2) - (min1 * min2);

        return maxProductDiff;

    }
}