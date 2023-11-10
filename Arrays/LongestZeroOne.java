class LongestZeroOne {

	// This function Prints the starting and ending
	// indexes of the largest subarray with equal
	// number of 0s and 1s. Also returns the size
	// of such subarray.

	int findSubArray(int arr[], int n)
	{
		int maxS = -1;
        int sum = 0;
         
        for(int i = 0; i < n-1; i++){
            sum = (arr[i] == 0) ? -1 : 1;

            for(int j = i+1; j <n; j++){
                if(arr[j] == 0){
                    sum += -1;
                }else{
                    sum += 1;
                }

                if(sum == 0 && maxS < j - i + 1){
                    maxS = j - i + 1;
                }
            }
            
        }
        // end = maxS +  start - 1;
        return maxS;

	}

	/* Driver program to test the above functions */

	public static void main(String[] args)
	{
		LongestZeroOne sub;
		sub = new LongestZeroOne();
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int size = arr.length;

		System.out.println(sub.findSubArray(arr, size));
	}
}
