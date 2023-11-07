class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // return false if matrix is empty
        if (matrix.length == 0) {
            return false;
        }

        // find then length of row and column here
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // finding the midrow and midcol here to compare whether target match with the
            // middle value
            int midRow = mid / n;
            int midCol = mid - (midRow * n);

            if (matrix[midRow][midCol] == target) {
                return true;
            } else if (matrix[midRow][midCol] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}