class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; i++){
                if(checkRepetition(s,i,j)){
                    res = Math.max(res,j-i-1);
                }
            }
        }
        return res;
    }

    public boolean checkRepetition(String s, int start, int end){
        int []chars = new int[128];

        for(int i = start; i < end; i++){
            char c = s.charAt(i);
            chars[c]++;

            if(chars[i] > 1){
                return true;
            }
        }
        return false;
    }
}




// apporach 2
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }
            
        }
        return maxLength;
    }
}