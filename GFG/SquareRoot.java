class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long low = 1;
		long high = x;
		long result = 0;
		
		while(low <= high){
		    long mid = (low + high) / 2;
		    // If mid^2 is less than or equal to x, update the result and search in the right half of the range.
		    
			if (mid * mid <= x) {
				result = mid;
				low = mid + 1;
			}
			// If mid^2 is greater than x, search in the left half of the range.
			else {
				high = mid - 1;
			}
		}
		
		return result;
		}
		
	 }