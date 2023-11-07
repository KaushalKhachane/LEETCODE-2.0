class Solution {
    public int missingNumber(int[] a) {


        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        int s2 = a.length*(a.length+1)/2;
        return (s2-sum);



        // int xor1 = 0;
        // int xor2 = 0;

        // for(int i = 0; i < nums.length - 1; i++){
        //     xor2 = xor2 ^ nums[i];
        //     xor1 = xor1 ^ (i+1);
        // }
        // xor1 = xor1 ^ nums.length;
        // return (xor1 ^ xor2);


        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != i) {
        //         return i;
        //     }
        // }
        // return nums.length; // If no missing number is found, return the next integer in sequence.
    }
}