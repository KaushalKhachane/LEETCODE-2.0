class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int n = nums.length;

        // if(n == 1){
        //     return nums[0];
        // }

        // for(int i = 0; i < nums.length; i++){
            
        //     if(i == 0){
        //         if(nums[i] != nums[i+1]){
        //             return nums[0];
        //         }
        //     }else if(i == nums.length-1){
        //         if(nums[i]!=nums[i-1]){
        //             return nums[nums.length-1];
        //         }
        //     }else{
        //         if((nums[i] != nums[i-1]) && nums[i] != nums[i+1]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;




        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];


        int low = 1, high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if((nums[mid] != nums[mid-1]) && (nums[mid] != nums[mid+1])){
                return nums[mid];
            }

            //elimination part odd even, even odd
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
 