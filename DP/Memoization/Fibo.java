import java.util.Arrays;
import java.util.Scanner;

public class Fibo {
    static int f(int n, int dp[]){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = f(n-1, dp) + f(n-2,dp);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = f(n, dp);
        System.out.println("Res = "+res);

    }   
}
