class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        int temp = 0;

        while(m <= h){
            switch(nums[m]){
                case 0:
                    temp = nums[l];
                    nums[l] = nums[m];
                    nums[m] = temp;
                    m++;
                    l++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    temp = nums[h];
                    nums[h] = nums[m];
                    nums[m] = temp;
                    h--;
                    break;
                    
            }
        } 
    }
}  