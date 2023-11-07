public class CountingSort {
    public static void countingSort(int a[]){
        int largest = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++){
            largest = Math.max(largest,a[i]);
        }
        int count[] = new int[largest+1];

        for(int i = 0; i < a.length; i++){
            count[a[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                a[j] = i;
                j++;
                count[i]--;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,8,9,10,11,12,13,14,15};
        countingSort(arr);

        for(int e : arr) {
            System.out.print(e+ " ");
        }
    }
}
