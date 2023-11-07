import java.util.Arrays;
import java.util.Comparator;

public class CountCoins {

    public static int[] reverseArray(int[]arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int countNumbersOfCoins(int coins[], int amount) {
        Arrays.sort(coins);
        reverseArray(coins, 0, coins.length-1);
        int res = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                int c = (int)Math.floor((double)amount / coins[i]);
                // System.out.println(c);
                res = res + c;
                amount = amount - (c * coins[i]);
                if (amount == 0) {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 1 };
        System.out.println(countNumbersOfCoins(arr, 57));
    }
}