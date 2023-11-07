public class PairSum {

    public static boolean pairSum(int[] arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        // time complexity o(n
        while (low < high) {
            if (arr[low] + arr[high] == k) {
                return true;
            }
            // decrementing high if sub of low and high is greater than target
            else if (arr[low] + arr[high] > k) {
                high--;
            }
            // incrementing low if sub of low and high is smaller than target
            else {
                low++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 11, 14, 16, 20, 21 };
        System.out.println(pairSum(arr, arr.length, 41));
    }
}
