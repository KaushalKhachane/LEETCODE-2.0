import java.util.Scanner;

public class MaxSubarray {

    public static int maximumSum(int[] arr) {
        int maxEnding = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding, maxEnding + arr[i]);
            res = Math.max(maxEnding, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Array INPUT
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = 0;
        // Printing SubArray Within Array (Brute Force Approach)
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int sum = 0;
                // The 3rd inner loop is to print the element between then i and j
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println("Maximun Sum of Subarray: " + maxSum);

        System.out.println(maximumSum(arr));
        sc.close();
    }
}