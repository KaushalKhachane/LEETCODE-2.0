public class CountPrimes {

    public static int countPrimes(int n) {
        int i = 2;
        int count = 0;
        while (i < n) {
            int j = 2;
            boolean isPrime = true;
            while (j * j <= i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime == true) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}