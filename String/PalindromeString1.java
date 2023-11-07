public class PalindromeString1 {
    // tc theta n and sc theta n
    public static boolean palindromeString(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        System.out.println(palindromeString("h"));
    }
}
