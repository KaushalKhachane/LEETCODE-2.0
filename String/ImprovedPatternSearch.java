public class ImprovedPatternSearch {

    public static int search(String text, String pat){
        int m = pat.length();
        int n = text.length();

        if(m > n){
            return -1;
        }

        for(int i = 0; i <= n - m; i++){
            int j;
            for(j = 0; j < m; j++){
                if(pat.charAt(j) != text.charAt(i+j)){
                    break;
                }
            }
            if(j == m){
                return i;
            }
            if(j == 0){
                i++;
            }else{
                i = i + j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "ABCD";
        String pat = "CD";
        System.out.println(search(text, pat));
    }
}
