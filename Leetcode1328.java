class Solution {
    public String breakPalindrome(String p) {
        char pArr[] = p.toCharArray();

        if(p.length() < 2){
            return "";
        }

        for(int i = 0; i < pArr.length / 2; i++){
            if(pArr[i] != 'a'){
                pArr[i] = 'a';
                return String.valueOf(pArr);
            }
        }
        //cross middle point of all ones
        pArr[pArr.length - 1] = 'b';
        return String.valueOf(pArr);
    }
}