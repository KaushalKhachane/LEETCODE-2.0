// find the whether the kth bit is set from the right side or not
public class KthBit {

    // using right shift
    // the idea is to shift the kth ele
    public static boolean kthBit(int n, int k) {
        if ((n >> (k - 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    // using left shift
    public static boolean kthBitLeft(int n, int k) {
        if ((n & (1 << (k - 1))) != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(kthBit(2, 2));
        System.out.println(kthBitLeft(5, 3));
    }
}
