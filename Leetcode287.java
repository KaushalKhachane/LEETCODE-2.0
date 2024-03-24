class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);

        for(int i = 0; i+1 < nums.length; i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
                break;
            }
        }

        return ans;
    }
}