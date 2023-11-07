import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        String result = s.trim();
        // System.out.println(result);
        int cn = 0;
        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) != ' ') {
                cn++;
            } else {
                break;
            }
        }
        return cn;
    }
}