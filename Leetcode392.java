class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        if(s.length() > t.length()){
            return false;
        }

        int i = 0;
        // i is the pointer to string s
        // j is the pointer to string t

        for(int j = 0; j < t.length(); j++){
            if(t.charAt(j) == s.charAt(i)) i++;
            if(i == s.length()) return true;
        }

        return false;
    }
}