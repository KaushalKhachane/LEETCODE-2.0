public class StockSpan2 {
    // O(n^2) solution
    static void stockSpan(int arr[], int n) {
        int span;
        for (int i = 0; i < n; i++) {
            span = 1; // Initialize span to 1 for the current day

            if (i > 0) {
                // Check the previous days to find the closest greater element on the left side
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] > arr[j]) {
                        span++; // Increment span for each greater element found
                    } else {
                        break; // Break out of the loop when you find a smaller or equal element
                    }
                }
            }

            System.out.print(span + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {30, 20, 25, 28, 27, 29};
        int n = arr.length;
        stockSpan(arr, n);
    }
}
