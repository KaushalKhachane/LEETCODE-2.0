import java.util.HashMap;
import java.util.Map;

public class LongSubArrayWithSum {

    public static int getLongestSubarray(int []a, int k){
        Map<Integer, Integer> preSum = new HashMap<>();
        int n = a.length;
        int sum = 0;
        int maxlen = 0;

        for(int i = 0; i < n; i++){
            sum = sum + a[i];
            if(sum == k){
                maxlen = Math.max(maxlen, i+1);
            }

            int need = k - sum;
            if(preSum.containsKey(need)){
                int len = i - preSum.get(need);
                maxlen = Math.max(maxlen, len);
            }

            if(!preSum.containsKey(sum)){
                preSum.put(sum, i);
            }
        }
        return maxlen;

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int[] a2 = { -1, 1, 1};

        int k = 10;
        int k2 = 1;
        int len = getLongestSubarray(a2, k2);
        System.out.println("The length of the longest subarray is: " + len);
    }
   
}