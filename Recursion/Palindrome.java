public class Palindrome {
    static int sum = 0;
    static int reverseNumber(int n){
        if(n == 0) {return 0;}
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumber(n/10);
        return sum;
    }

    static boolean isPalindrome(int n){
        System.out.println("N: "+n);
        System.out.println("Reverse of N: "+ reverseNumber(n));
        if(n == reverseNumber(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
