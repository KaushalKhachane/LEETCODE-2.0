class Solution {
    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length()-1;

        while(begin < end){
            char leftChar = Character.toLowerCase(s.charAt(begin));
            char rightChar = Character.toLowerCase(s.charAt(end));
            if(!Character.isLetterOrDigit(leftChar)){
                begin++;
            }
            else if(!Character.isLetterOrDigit(rightChar)){
                end--;
            }
            else if(leftChar != rightChar){
                return false;
            }else{
                begin++;
                end--;
            }
        }
        return true;
    }
}