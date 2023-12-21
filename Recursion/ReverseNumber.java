public class ReverseNumber {
    static int sum = 0;
    static void reverseNumber(int n){
        if(n == 0) {return;}
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumber(n/10);
    }
    // this is to calculate the sum of digits in the given number
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1; // calculate the number of digits in number
        System.out.println(digits);
        return helper(n, digits);
    }

    // returns the reverse of number
    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = digits % 10;
        return rem * (int)Math.pow(10 , digits-1) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        // reverseNumber(1234);
        // System.out.println(sum);
        int res = rev2(1234);
        System.out.println(res);
    }
}
