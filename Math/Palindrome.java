public class Palindrome {

    public static boolean isPanlindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if (rev != num) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPanlindrome(515));
    }
}
