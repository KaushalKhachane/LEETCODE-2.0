// Greatest Common Divisors
public class GCDNumber {

    // time complexity o(min(a,b))
    public static int gcdNumber(int a, int b) {
        int res = Math.max(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    // euclidean algorithhum
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // optimized version of euclidean algorithum
    // time complexity
    public static int gdc1(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gdc1(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcdNumber(10, 15));
        System.out.println(gcd(10, 15));
        System.out.println(gdc1(10, 15));
    }
}
