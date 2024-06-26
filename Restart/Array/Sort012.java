import java.util.ArrayList;
import java.util.Arrays;

public class Sort012 {

    public static void sortArray(ArrayList<Integer> a, int n){
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            if(a.get(mid) == 0){
                int temp = a.get(low);
                a.set(low, a.get(mid));
                a.set(mid, temp);
                mid++;
                low++;
            }
            else if(a.get(mid) == 1){
                mid++;
            }else{
                int temp = a.get(mid);
                a.set(mid, a.get(high));
                a.set(high, temp);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }   
}
