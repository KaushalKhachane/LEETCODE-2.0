class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < l.length; i++){
            int left = l[i];
            int right = r[i];

            int []subarray = Arrays.copyOfRange(nums, left, right+1);

            // Sort the subarray
            Arrays.sort(subarray);

            // Check if the sorted subarray is arithmetic
            result.add(isArithmetic(subarray));
        }
        return result;
    }

    public boolean isArithmetic(int[] subarr){
        // Check if the difference between every two consecutive elements is the same
        int commondiff = subarr[1] - subarr[0];

        for(int i = 2; i < subarr.length; i++){
            if(subarr[i] - subarr[i-1] != commondiff){
                return false;
            }      
        }
        return true;
    }
}