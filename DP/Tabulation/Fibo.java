public class Fibo {
    static void f(){
        
    }
    public static void main(String[] args) {
        int n = 10;
        // int dp[] = new int[n+1];
        // space optimized
        int prev = 1;
        int prev2 = 0;
        for(int i = 2; i <= n; i++){
            int curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);


        // ----------------

        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
