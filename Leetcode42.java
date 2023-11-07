class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // we have declared two array
        // left array to store the greatest height building to the left
        int left[] = new int[n];
        // left array to store the greatest height building to the left
        int right[] = new int[n];

        // 1st position of the left array is the height of the first element itself
        left[0] = height[0];
        // height of the last element of the right array is the height of the last
        // element itself
        right[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int ans = 0;
        // here we compare the left and right array element one by one and store the min
        // element from them in ans array
        for (int i = 0; i < n; i++) {
            ans += (Math.min(left[i], right[i]) - height[i]);
        }
        return ans;
    }
}