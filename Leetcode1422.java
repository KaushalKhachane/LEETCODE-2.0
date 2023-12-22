class Solution {
    public int maxScore(String s) {
        int max = 0;
        int n = s.length();

        for (int i = 1; i < s.length(); i++) {
            int zeroCount = 0;
            int oneCount = 0;
           for(int j = i-1; j >=0; j--){
               if(s.charAt(j) == '0'){
                   zeroCount++;
               }
           }
           for(int j = i; j < n; j++){
               if(s.charAt(j) == '1'){
                   oneCount++;
               }
           }
           if(zeroCount+oneCount > max){
               max = zeroCount + oneCount;
           }
        }
        return max;
    }
}