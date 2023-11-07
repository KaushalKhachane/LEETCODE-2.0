
import java.util.Scanner;

public class Subarray {
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

        // Printing SubArray Within Array (Brute Force Approach)
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                // The 3rd inner loop is to print the element between then i and j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}