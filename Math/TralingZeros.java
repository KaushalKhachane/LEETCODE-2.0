public class TralingZeros {

    // time complexity theta(n)
    public static int tralingZeros(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }

        int rev = 0;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
            count++;
        }

        return count;
    }

    // time complexity O(logn)
    // here we calculate the number of 5 present in the factorial
    // if 25 then number of 5 is 2 and for 125 it is 3
    public static int countTralingZeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(tralingZeros(5));
        System.out.println(countTralingZeros(251));
    }
}
