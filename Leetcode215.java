import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];/

        // it will create min heap by default
        // the idea is to craete min heap of k- size and then replace the min heap item
        // if the remaining array items found to be greater than min-heap.peek()
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pQ.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (pQ.peek() < nums[i]) {
                pQ.poll();
                pQ.add(nums[i]);
            }
        }

        return pQ.peek();
    }
}