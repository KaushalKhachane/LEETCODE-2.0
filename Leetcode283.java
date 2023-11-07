class Solution {
    public void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        
        for(int i = j + 1; i < nums.length; i++){
            if(j != -1){
                if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            }
        }
    }
}