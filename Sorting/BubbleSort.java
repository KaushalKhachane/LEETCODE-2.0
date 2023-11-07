public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i = 0; i < n-1; i++){
            swapped = false;
            for(int j = 0; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,8,9,10,11,12,13,14,15};
        bubbleSort(arr);

        for(int e : arr) {
            System.out.print(e+ " ");
        }
    }
}
