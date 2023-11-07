import java.util.Collections;
import java.util.PriorityQueue;

// GFG Problem (Find the kth smallest element)
public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pQ.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pQ.peek() > arr[i]) {
                pQ.poll();
                pQ.add(arr[i]);
            }
        }

        return pQ.peek();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(kthSmallest(arr, 5));
    }
}