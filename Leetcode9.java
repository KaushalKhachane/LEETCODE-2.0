class Solution {
    public boolean isPalindrome(int x) {
        int rev=0, lastdigit=0, temp=x;
        while(x > 0){
            lastdigit = x % 10;
            rev = (rev * 10) + lastdigit;
            x = x / 10;
        }

        if(rev == temp){
            return true;
        }else{
            return false;
        }
    }
}