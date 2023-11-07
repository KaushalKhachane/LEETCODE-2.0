//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {
    public int[] topK(int[] nums, int k) {
           HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);    
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
        
            if(map.get(a) == map.get(b)){
                return b-a;
            }
            
            return map.get(b) - map.get(a);
        });
    
        for(int num: map.keySet()){
            pq.add(num);
        }
    
        int output[] = new int[k];
        for(int i = 0; i<k; i++){
            output[i] = pq.poll();
        }
        
        return output;  
    
}
}
