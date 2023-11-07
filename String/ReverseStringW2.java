class ReverseStringW2 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        
        // Step 1: Reverse the entire string
        reverseString(charArray, 0, n - 1);
        
        int start = 0;
        int end = 0;
        
        while (start < n) {
            while (end < n && charArray[end] != ' ') {
                end++;
            }
            // Step 2: Reverse each word
            reverseString(charArray, start, end - 1);
            start = end + 1;
            end = start;
        }
        
        return new String(charArray);
    }
    
    private void reverseString(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseStringW2 obj = new ReverseStringW2();
        String res = obj.reverseWords("Kaushal Sunil Khachane");
        System.out.println(res);
    }
}
