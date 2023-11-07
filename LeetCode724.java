class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;
        int lSum = 0;

        // here we calculating tSum of the array first
        for (int i = 0; i < nums.length; i++) {
            tSum = tSum + nums[i];
        }

        // here we are checking whether leftsum is equal to total sum if so then we
        // return index
        // we minus the array element one by one from the nums array and also add the
        // element to the leftsum variable one by one and if in between tSum and lSum
        // found to be equal then return index at that postion and this is the pivot
        // index
        for (int i = 0; i < nums.length; i++) {
            tSum -= nums[i];
            if (tSum == lSum) {
                return i;
            }
            lSum = lSum + nums[i];
        }

        return -1;
    }
}