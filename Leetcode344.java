class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int e = s.length - 1;

        while(start <= e){
            char temp = s[start];
            s[start] = s[e];
            s[e] = temp;
            start++;
            e--;
        }
    }
}