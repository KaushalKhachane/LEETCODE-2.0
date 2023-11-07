public class LeftRotation {
    public static int[] leftRotation(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 0, 0, 30, 0, 40, 50, 0 };
        for (int element : leftRotation(arr)) {
            System.out.print(element + " ");
        }
    }
}
