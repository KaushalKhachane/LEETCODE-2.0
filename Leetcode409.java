class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> counts = new HashMap();
        
        for(char c : s.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        int result = 0;
        boolean isOddLength = false;

        for(int c : counts.values()){
            if(c % 2 == 0){
                result += c;
            }else{
                isOddLength = true;
                result += c-1;
            }
        }
        if(isOddLength) result++;
        return result;
    }
}