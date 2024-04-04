class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = 0;
        // int changes = 0;
        for(int i = 0; i < s.length(); i++){
            int hash[] = new int[128]; 
            int maxf = 0;
            int changes = 0; // Moved changes inside the outer loop
            for(int j = i; j < s.length(); j++){
                hash[s.charAt(j)]++;
                maxf = Math.max(maxf, hash[s.charAt(j)]);
                changes = (j-i+1) - maxf;
                if(changes <= k){
                    maxlen = Math.max(maxlen, j-i+1);   
                }else{
                    break;
                }
            }
        }
        return maxlen;
    }
}