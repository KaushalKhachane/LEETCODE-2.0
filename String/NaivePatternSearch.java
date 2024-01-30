public class NaivePatternSearch{
    
    public static int search(String text, String pat){
        int n = text.length();
        int m = pat.length();

        if(m > n){
            return -1;
        }

        for(int i = 0; i <= n - m; i++){
            int j;
            for(j = 0; j < m; j++){
                if(text.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            } 
            if(j == m){
                return i;
            }
        }
        return -1;  
    }

    public static void main(String []args){
        String text = "ABCD"; 
        String pat = "CD";
        System.out.println(search(text, pat));
    }
}