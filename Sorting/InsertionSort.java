public class InsertionSort {
    public static void insertionSort(int a[]){
        for(int i = 1; i < a.length; i++){
            int key = a[i];
            int j = i-1;

            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,8,9,10,11,12,13,14,15};
        insertionSort(arr);

        for(int e : arr) {
            System.out.print(e+ " ");
        }
    }
}
