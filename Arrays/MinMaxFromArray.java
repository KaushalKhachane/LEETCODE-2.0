import java.util.Arrays;

public class MinMaxFromArray {

    static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int arr[], int n) {
        Pair oPair = new Pair();
        Arrays.sort(arr);
        oPair.min = arr[0];
        oPair.max = arr[n - 1];
        return oPair;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println("Min: "+minmax.min);
        System.out.println("Max: "+minmax.max);
    }
}
