public class EqualHalf {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    static public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        String main = "aeiouAEIOU";
        int count1 = 0;
        for(int i = 0; i < half; i++){
            int ch = s.charAt(i);
            if (main.indexOf(ch) != -1) {
                count1++;                
            }
        }
        int count2 = 0;
        for(int i = half; i < s.length(); i++){
            int ch = s.charAt(i);
            if (main.indexOf(ch) != -1) {
                count2++;                
            }
        }
        if(count1 != count2){return false;}
        return true;
    }
}
