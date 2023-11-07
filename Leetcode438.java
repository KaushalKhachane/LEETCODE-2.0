import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] phash = new int[26];
        int len = p.length();
        int window = s.length();

        if (len > window)
            return ans;

        int[] hash = new int[26];
        int left = 0, right = len - 1;

        // Calculate the initial hash for pattern 'p'
        for (int i = 0; i < len; i++) {
            phash[p.charAt(i) - 'a']++;
            hash[s.charAt(i) - 'a']++;
        }

        while (right < window) {
            // Check if the current window (substring of 's') is an anagram of 'p'
            if (compareArrays(phash, hash))
                ans.add(left);

            // Move the window to the right
            hash[s.charAt(left) - 'a']--; // Remove left character from hash
            left++;
            right++;

            if (right < window)
                hash[s.charAt(right) - 'a']++; // Add right character to hash
        }

        return ans;
    }

    private boolean compareArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}