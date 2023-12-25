import java.util.Arrays;

public class ReverseArray {
    // rec using 2 pointers
    public static void reverse(int l, int r, int[] arr){
        if(l >= r){
            return;
        }
        // System.out.println("l: "+ l+ ", r: "+ r);
        swap(l, r, arr);
        reverse(l+1, r-1, arr);
    }

    public static void swap(int l, int r, int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        reverse(0, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
