public class MaxDiff {

    // n square
    public static int maxDiff(int arr[]) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }

    // order of n
    public static int maxDifference(int arr[]) {
        int res = arr[1] - arr[0];
        // idea is to keep track of min value runtime
        int minValue = arr[0];

        for (int j = 0; j < arr.length; j++) {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 0, 0, 30, 500, 40, 120, 100 };
        int res = maxDiff(arr);
        System.out.println("Result: " + res);
        System.out.println("Result 2: " + maxDifference(arr));
    }
}
