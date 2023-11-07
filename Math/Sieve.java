import java.util.Arrays;

// find the prime number till given numbers

public class Sieve {

    public static void printPrimes(int num) {

        // declare boolean type array and marks all the element true at first time
        boolean[] prime = new boolean[num + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= num; i++) {
            // check if the number
            if (prime[i]) {
                // mark all the multiple of the prime no. to false like non prime number became
                // false now

                // we can use j = i * i insted of j = i * `2
                for (int j = 2 * i; j <= num; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    // o(log log n)
    public static void sievePrint(int num) {
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                for (int j = i * i; j <= num; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(10);
        System.out.println("---------------");
        sievePrint(10);

    }
}
