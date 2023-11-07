import java.util.Arrays;

public class LeftMostRepeatingChar {
    
    public static final int CHAR = 256;

    // order of n square
    public static final int leftMostChar(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1 ; j < str.length(); j++) {
                if(str.charAt(i) ==  str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    
    // order of n
    public static int leftMost(String str){
        int count[] = new int[CHAR];
        Arrays.fill(count,-1);
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < str.length(); i++){
            int fi = count[str.charAt(i)];
            if(fi == -1){
                count[str.charAt(i)] = i;
            }else{
                res = Math.min(res, fi);
            }
        }
        return(res==Integer.MAX_VALUE) ? Integer.MAX_VALUE : res;
    }

    // traverse from right to left
    public static int rightToLeft(String str){
        boolean visited[] = new boolean[CHAR];
        int res = -1;

        for(int i = str.length()-1; i > 0; i--){
            if(visited[str.charAt(i)]){
                res = i;
            }else{
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(rightToLeft("Kaushal"));
    }
}
