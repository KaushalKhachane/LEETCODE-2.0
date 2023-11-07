public class Atoi {
    public int myAtoi(String str) {
        str = str.trim(); // Remove leading and trailing whitespace

        if (str.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;

        // Check for a sign character
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            // Check for overflow
            System.out.println(result+" < "+Integer.MAX_VALUE / 10);
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        Atoi atoi = new Atoi();
        String s1 = "42";
        String s2 = "   -42";
        String s3 = "4193 with words";
        String s4 = "words and 987";
        String s5 = "-91283472332";

        System.out.println(atoi.myAtoi(s1)); // Output: 42
        System.out.println("-----------------");
        System.out.println(atoi.myAtoi(s2)); // Output: -42
        System.out.println("-----------------");

        System.out.println(atoi.myAtoi(s3)); // Output: 4193
        System.out.println("-----------------");

        System.out.println(atoi.myAtoi(s4)); // Output: 0
        System.out.println("-----------------");

        System.out.println(atoi.myAtoi(s5)); // Output: -2147483648
    }
}
