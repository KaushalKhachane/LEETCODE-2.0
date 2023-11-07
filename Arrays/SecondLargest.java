import java.util.Locale.LanguageRange;

public class SecondLargest {

    // find the index of largest element in array
    public static int greatest(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    // find the index of second largest element in array
    public static int secondGreatest(int arr[]) {
        int sLargest = -1;
        int largest = greatest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (sLargest == -1) {
                    sLargest = i;
                } else if (arr[i] > arr[sLargest]) {
                    sLargest = i;
                }
            }
        }
        return sLargest;
    }

    // efficient approach
    // a[i] > a[largest] = res = largest and largest
    // a[i] == a[largest] ignore this case
    // a[i] < a[largest]
    // | below three case for the second largest element only
    // |
    // res == -1: res = i
    // a[i] <= a[res] : ignore
    // a[i] > a[res] : res = i

    public static int sLargestEle(int arr[]) {
        int res = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 4, 50 };
        System.out.println("Largest Element Index: " + greatest(arr));
        System.out.println("Second Largest Element Index: " + secondGreatest(arr));
        System.out.println("Second Largest: " + sLargestEle(arr));
    }
}
