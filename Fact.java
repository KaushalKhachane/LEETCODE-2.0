public class Fact {
    public static int factorialWithoutMulDiv(int n) {
        int result = n;
        for (int i = n - 1; i > 0; i--) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += result;
            }
            result = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Example number
        System.out.println("Factorial of " + n + " is " + factorialWithoutMulDiv(n));
    }
}
