class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int n = heights.length;

        int ps[] = new int[n];
        int ns[] = new int[n];

        // fill the ps array
        for(int i = 0; i < n; i++){
            while(!s.empty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            ps[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }

        //clear the stack
        s.clear();

        // fill the ns array
        for(int i = n-1; i >= 0; i--){
            while(!s.empty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            ns[i] = s.empty() ? n : s.peek();
            s.push(i);
        }

        int res = 0;

        for(int i = 0; i < n; i++){
            int curr = heights[i];
            curr += (i-ps[i]-1)*heights[i];
            curr += (ns[i]-i-1)*heights[i];
            res = Math.max(res, curr);
        }
        return res;
    }
}