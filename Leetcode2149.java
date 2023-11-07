class Solution {
    public int[] rearrangeArray(int[] nums) {

        // optimal
        //tc O(n)
        //sc O(n)
        int []ans = new int[nums.length];
        Arrays.fill(ans,0);

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                ans[neg] = nums[i];
                neg += 2;
            }else{
                ans[pos] = nums[i];
                pos+=2;
            }
        }

        return ans;
    }
}