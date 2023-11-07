
public class CountBits {

    // naive solution
    public static int countBits(int num) {
        int res = 0;
        while (num > 0) {
            if ((num & 1) == 1) { // if(n % 2 != 0) {}
                res++;
            }
            num = num >> 1; // n = n / 2
        }
        return res;
    }

    // brian keerningams algorithum
    public static int countSetBits(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countBits(5));
        System.out.println(countSetBits(5));
    }
}
