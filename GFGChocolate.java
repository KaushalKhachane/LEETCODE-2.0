import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr.add(x);
            }
            int m = sc.nextInt();

            Solution ob = new Solution();

            System.out.println(ob.findMinDiff(arr, n, m));
        }

    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        long res = Integer.MAX_VALUE;
        Collections.sort(a);

        for (int i = 0; i + m - 1 < n; i++) {
            int minw = a.get(i);
            int maxw = a.get(i + m - 1);

            int gap = maxw - minw;
            if (gap < res) {
                res = gap;
            }
        }
        return res;
    }
}