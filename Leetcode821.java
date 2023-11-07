class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int result[] = new int[n];

        // Initialize pos to a value that is out of range initially
        int pos = -n;

        // Loop from left to right
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);

            // Check if the current character is equal to 'c'
            if (current == c) {
                pos = i;
            }

            // Calculate the minimum distance from 'c' to the current character
            result[i] = i - pos;
        }

        // Reset 'pos' to a value that is out of range initially
        pos = 2 * n;

        // Loop from right to left to update the distances
        for (int i = n - 1; i >= 0; i--) {
            char current = s.charAt(i);

            // Check if the current character is equal to 'c'
            if (current == c) {
                pos = i;
            }

            // Calculate the minimum distance from 'c' to the current character
            result[i] = Math.min(result[i], pos - i);
        }

        return result;
    }
}
