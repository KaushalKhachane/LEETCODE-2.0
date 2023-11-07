public class MoveZerosToEnd {

    public static void zerosToEnd(int arr[]) {
        // we keep track of non zero element
        // if next element is zero then we keep as it is
        // when next element is non-zero we swap this with count

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 0, 0, 30, 0, 40, 50, 0 };
        zerosToEnd(arr);
    }
}