import java.util.Arrays;

public class DpFib {
    public static int fib(int[] dp, int n) {
        if(n < 2){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fib(dp, n-1) + fib(dp, n-2);
        return dp[n];
    }

    public static void main(String[] args) {
        
        int dp[] = new int[6+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(dp, 6));
    }
}
