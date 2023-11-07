class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // remove leading and trailing whitespace
    
        if(s.isEmpty()){
            return 0;
        }

        int sign = 1;
        int i = 0;

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;`
        }

      return (int)(result * sign);  
    }
    
}