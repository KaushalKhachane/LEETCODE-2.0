public class MaxEvenOddLength {

    public static int maxLength(int arr[]) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int current = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    current++;
                } else {
                    break;
                }
            }
            res = Math.max(res, current);
        }
        return res;
    }

    // complexity order of n
    public static int maxLengthUpdated(int arr[]) {
        int res = 1;
        int current = 1;
        for (int j = 1; j < arr.length; j++) {
            if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                current++;
                res = Math.max(current, res);
            } else {
                current = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 10 };
        System.out.println(maxLength(arr));
        System.out.println(maxLengthUpdated(arr));
    }
}
