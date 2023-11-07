class Solution {
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        int j;
        for(j=0;j<nums.length;j++){
            if(nums[j]>target){
                return j;
            }
        }

        return j;
    }
}