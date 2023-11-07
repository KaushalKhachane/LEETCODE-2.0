class Solution {
    public boolean isPalindrome(String s) {
    String finalString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int rev = finalString.length() - 1;
        boolean flag = true;
        for(int i = 0; i < finalString.length(); i++){
            if(i >= rev){
                break;
            }
            if(finalString.charAt(i) != finalString.charAt(rev)){
                flag = false;
                break;
            }
            rev--;
        }
        return flag;
    }
}