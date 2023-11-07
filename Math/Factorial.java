public class Factorial {

    public static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // recursion
    public static int facotial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * facotial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(facotial(5));
    }
}