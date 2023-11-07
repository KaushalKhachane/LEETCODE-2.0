class Solution {

    public int longestHist(char m[]){
        int n = m.length;
        Stack<Integer> s = new Stack<>();

        int ps[] = new int[n];
        int ns[] = new int[n];

        //fill ps array
        for(int i = 0; i < n; i++){
            while(!s.empty() && m[s.peek()] >= m[i]){
                s.pop();
            }

            ps[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }

        s.clear();

        //fill ns array
        for(int i = n-1; i >= 0; i--){
            while(!s.empty() && m[s.peek()] >= m[i]){
                s.pop();
            }

            ns[i] = s.empty() ? n : s.peek();
            s.push(i);
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            int curr = m[i] - '0'; // Convert character to integer
            curr += (i-ps[i]-1) * (m[i] - '0');
            curr += (ns[i]-i-1) * (m[i] - '0');
            res = Math.max(res, curr);
        }

        return res;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int res = longestHist(matrix[0]);
        int r = matrix.length;
        int c = matrix[0].length; 
        for(int i = 1; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == '1'){
                    matrix[i][j] += matrix[i-1][j] - '0'; // Convert characters to integers and update
                }
            }
            res = Math.max(res, longestHist(matrix[i]));
        }
        return res;
    }
}
