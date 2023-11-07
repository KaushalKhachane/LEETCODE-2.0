public class StockSpan {
    // o(n^2)
    public static void stockSpan(int arr[], int n){
        for(int i  = 0; i < n; i++){
            int span = 1;
            for(int j = i-1; j >= 0 && arr[i] >= arr[j] ; j--){
                span++;
            }
            System.out.print(span+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {30,20,25,28,27,29};
        int n = arr.length;
        stockSpan(arr, n);
    }
}
