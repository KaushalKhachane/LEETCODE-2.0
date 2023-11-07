class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

        // // extra space
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // } 
        // int k = set.size();
        // int j = 0;
        // for (int x: set) {
        //     nums[j++] = x;
        // }
        // return k;
    }
}