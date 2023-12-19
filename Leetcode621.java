class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];

        // Iterate through each pixel in the original image
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                // Apply smoothing filter to the current pixel
                result[i][j] = calculateSmoothedValue(img, i, j, rows, cols);
            }
        }

        return result;
    }

    // Helper method to calculate smoothed value for a pixel
    private int calculateSmoothedValue(int[][] img, int x, int y, int rows, int cols) {
        int totalSum = 0;
        int count = 0;

        // Iterate over the 3x3 neighborhood around the current pixel
        for (int i = Math.max(0, x - 1); i < Math.min(rows, x + 2); ++i) {
            for (int j = Math.max(0, y - 1); j < Math.min(cols, y + 2); ++j) {
                // Accumulate the sum of pixel values in the neighborhood
                totalSum += img[i][j];
                // Count the number of valid cells in the neighborhood
                count += 1;
            }
        }

        // Calculate the average and round down
        return totalSum / count;
    }
}
