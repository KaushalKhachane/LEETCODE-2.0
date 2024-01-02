public class FunctionalPalindrome {
    static boolean pal(int l, int r, String str){
        if(l >= r){
            return true;
        }
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return pal(l+1, r-1, str);
    }
    public static void main(String[] args) {
        String str = "kbhk";
        System.out.println(pal(0, str.length()-1, str));
    }
}
