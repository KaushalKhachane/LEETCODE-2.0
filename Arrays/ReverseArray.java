public class ReverseArray {
    // in place sorting
    public static int[] reverseArr(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        int temp;

        while (start < end) {
            // swap first and last element
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int res[] = reverseArr(arr, arr.length);

        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
