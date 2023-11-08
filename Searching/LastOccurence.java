public class LastOccurence {
    public static int binarySearch(int[] a, int s, int e, int x, int n) {
        if (s > e)
            return -1;

        int mid = s + (e - s) / 2;
        if (a[mid] > x) {
            return binarySearch(a, s, mid - 1, x, n);
        } else if (a[mid] < x) {
            return binarySearch(a, mid + 1, e, x, n);
        } else {
            if (mid == n - 1 || a[mid] != a[mid + 1]) {
                return mid;
            } else {
                return binarySearch(a, mid + 1, e, x, n);
            }
        }
    }

    public static int lastOccurence(int a[], int s, int e, int x, int n) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] > x) {
                e = mid - 1;
            } else if (a[mid] < x) {
                s = mid + 1;
            } else {
                if (mid == n - 1 || a[mid] != a[mid + 1]) {
                    return mid;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 10, 10, 10, 20, 20 };
        System.out.println(lastOccurence(a, 0, a.length - 1, 10, a.length));
    }
}
