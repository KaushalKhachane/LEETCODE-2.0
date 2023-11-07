class Solution {
    public int longestMountain(int[] A) {
        int maxLength = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                while (left > 0 && A[left - 1] < A[left]) {
                    left--;
                }

                while (right < A.length - 1 && A[right] > A[right + 1]) {
                    right++;
                }

                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}