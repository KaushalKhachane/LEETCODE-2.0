public class PrimeNumber {

    // naive solution
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // checked until sqrt(n)
    public static boolean isPrimeNum(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrimeNum(13));
        System.out.println(isPrimeNum(14));
        System.out.println(isPrimeNumber(13));
        System.out.println(isPrimeNumber(22));
        System.out.println(isPrime(2));

    }
}
