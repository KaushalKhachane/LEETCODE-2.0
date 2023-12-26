import java.util.Arrays;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] countS1 = new int[26]; // Assuming lowercase English letters
        int[] countWindow = new int[26];

        // Initialize the count arrays for the first window
        for (int i = 0; i < s1.length(); i++) {
            countS1[s1.charAt(i) - 'a']++;
            countWindow[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(countS1, countWindow)) {
                return true;
            }

            // Move the window by updating counts
            countWindow[s2.charAt(i) - 'a']++;
            countWindow[s2.charAt(i - s1.length()) - 'a']--;
        }

        // Check for the last window after the loop
        return Arrays.equals(countS1, countWindow);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(solution.checkInclusion(s1, s2)); // Output: true
    }
}
