public class SelectionSort {
    public static void selectionSort(int a[]){
        int n = a.length;
        int minI;
        for(int i = 0; i < n-1; i++){
            minI = i;
            for(int j = i+1; j < n; j++){
                if(a[minI] > a[j]){
                    minI = j;
                }
            }
            // swapping
            int temp = a[minI];
            a[minI] = a[i];
            a[i] = temp;
        }

    }
    public static void main(String[] args) {
        int a[] = {1,5,6,7,8,9,10,11,12,13,14,15};
        selectionSort(a);

        for(int e : a) {
            System.out.print(e+ " ");
        }
    }
}
