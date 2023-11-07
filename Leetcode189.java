class Solution {
    public void rotate(int[] arr1, int k) {
        int n = arr1.length;
        int[] arr2 = new int[n];

     k=k%n;

        // Copy the last k elements to arr2 starting from index 0
        for (int i = n - k, j = 0; i < n; i++, j++) {
            arr2[j] = arr1[i];
        }

        // Copy the remaining elements (excluding the last k elements) to arr2
        for (int i = 0, j = k; i < n - k; i++, j++) {
            arr2[j] = arr1[i];
        }

        // Copy the elements back to arr1 to update the original array
        for (int i = 0; i < n; i++) {
            arr1[i] = arr2[i];
        }
    }
}