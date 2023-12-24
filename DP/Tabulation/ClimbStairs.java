
public class ClimbStairs {
   
    public static void main(String[] args) {
        int n = 3;
        int prev = 1;
        int prev2 = 1;
        for(int i = 2; i <= n; i++){
            int curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }
}
