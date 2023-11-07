public class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fib_array = new int[n + 1];
        fib_array[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib_array[i] = fib_array[i - 1] + fib_array[i - 2];
        }
        return fib_array[n];
    }
}