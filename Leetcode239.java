class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        
        // store index
        Deque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            // remove number out of range k
            if(!q.isEmpty() && q.peek() == i-k){
                q.poll();
            }

            // remove smaller number in k range as they are useless
            while(!q.isEmpty() && a[q.peekLast()] < a[i]){
                q.pollLast();
            }

            q.offer(i);

            if(i >= k-1){
                r[ri++] = a[q.peek()]; 
            }

            
        }
        return r;
    }
}