class Solution {

    // public void reverse(char[] chars, int start, int end) {
    //     while (start < end) {
    //         char temp = chars[start];
    //         chars[start] = chars[end];
    //         chars[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

     public String reverseWords(String s) {
    //     char chars[] = s.toCharArray();
    //     int n = s.length();

    //     reverse(chars, 0, n - 1); // reverse the entire string

    //     int start = 0;
    //     int end = 0;

    //     while (end < n) {

    //         while (end < n && chars[end] != ' ') {
    //             end++;
    //         }

    //         reverse(chars, start, end - 1);

    //         while (end < n && chars[end] == ' ') {
    //             end++;
    //         }

    //         start = end;
    //     }
    //     return new String(chars);

        String result = new String();
        int n = s.length();
        int i = 0;

        while(i < n){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }

            if(i >= n) break;
            int j = i + 1;
            while(j < n && s.charAt(j) != ' '){
                j++;
            }
            String w = s.substring(i, j);
            if(result.length() == 0){
                result = w;
            }else{
                result = w + " " + result;
            }
            i = j +1;
        }
        return result;
    }
}