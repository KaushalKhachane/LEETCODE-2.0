public class NaivePatternSearch {

    static void patternSearch(String original, String pattern){
        int m = original.length();
        int n = pattern.length();

        for(int i = 0; i < m - n; i++){
            int j; 
            for(j = 0; j < n; i++){
                if(pattern.charAt(j) != original.charAt(i+j)){
                    break;
                }
            }
            if(j==n){System.out.print(i+" ");}
        }
    }


    public static void main(String[] args) {
        System.out.println("B");
        String oString = "ABABABA";
        String paString = "AB";
        patternSearch(oString, paString);
        System.out.println("Hello");
    }
}
