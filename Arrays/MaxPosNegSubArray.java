import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		Map<Long, Integer> map = new HashMap<>();
		Map<Long, Integer> preSumMap = new HashMap<>();
		int n = nums.length;
		long sum = 0;
		int maxLength = 0;

		for(int i = 0; i < n; i++){
			sum += nums[i];

			if(sum == k){
				maxLength = Math.max(maxLength, i + 1);
			}

			long more = sum - k;

			if(map.containsKey(more)){
				int len = i - map.get(more);
				maxLength = Math.max(maxLength, len);
            }

            //Finally, update the map checking the conditions:
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
		}
		return maxLength;
	}
}