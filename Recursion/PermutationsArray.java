import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsArray {

    public static ArrayList<int[]> getPermutations(int[] arr, int[] up) {
        ArrayList<int[]> result = new ArrayList<>();
        getPermutationsHelper(arr, up, result);
        return result;
    }

    private static void getPermutationsHelper(int[] arr, int[] up, ArrayList<int[]> result) {
        if (up.length == 0) {
            result.add(Arrays.copyOf(arr, arr.length));
            return;
        }

        int element = up[0]; // taken the first element
        for (int i = 0; i <= arr.length; i++) {
            int[] newArr = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, i); // first part
            newArr[i] = element;
            System.arraycopy(arr, i, newArr, i + 1, arr.length - i);

            int[] newUp = Arrays.copyOfRange(up, 1, up.length); // reduce the UP
            getPermutationsHelper(newArr, newUp, result);
        }
    }

    public static int getPermutationsCount(int[] arr, int[] up) {
        if (up.length == 0) {
            return 1;
        }
        int count = 0;
        int element = up[0];
        for (int i = 0; i <= arr.length; i++) {
            int[] newArr = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, i);
            newArr[i] = element;
            System.arraycopy(arr, i, newArr, i + 1, arr.length - i);

            int[] newUp = Arrays.copyOfRange(up, 1, up.length);
            count += getPermutationsCount(newArr, newUp);
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage with arrays of integers
        int[] initialArray = {};
        int[] elements = {1, 2, 3};
        ArrayList<int[]> res = getPermutations(initialArray, elements);

        for (int[] perm : res) {
            System.out.println(Arrays.toString(perm));
        }

        int count = getPermutationsCount(initialArray, elements);
        System.out.println(count);
    }
}
