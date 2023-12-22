import java.util.Arrays;

public class Pattern {

    public static void traingle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            traingle(r, c + 1);
        } else {
            System.out.println();
            traingle(r - 1, 0);
        }
    }

    static void traingle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            traingle2(r, c + 1);
            System.out.print("*");
        } else {
            traingle2(r - 1, 0);
            System.out.println();
        }
    }

    static void bubble(int arr[], int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }

    static void selection(int arr[], int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {

            // swap
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selection(arr, r - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        traingle(4, 0);
        System.out.println();
        int arr[] = { 4, 3, 2, 1 };
        // bubble(arr, arr.length - 1, 0);
        selection(arr, 4, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
