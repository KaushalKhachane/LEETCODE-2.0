class Solution {
    public int countPrimes(int n) {
        int i = 2;
        int count = 0;
        while (i < n) {
            // add the j inside the while loop cause evry time we have start from j = 2 for
            // finding
            // whether specific number is prime or not
            int j = 2;
            boolean isPrime = true;
            // j*j for the time complexity O(sqrt(n)
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
}