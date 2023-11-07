import static java.lang.Math.*;

public class NumberOfDigit {

    // iterative solution
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // recursive solution
    public static int cDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + cDigit(num / 10);
    }

    // logarithmin solution
    public static long digit(long n) {
        return (long) floor(log10(n) + 1);
    }

    public static void main(String[] args) {
        System.out.println(countDigit(123));
        System.out.println(cDigit(123));
        System.out.println(digit(134));
    }
}
