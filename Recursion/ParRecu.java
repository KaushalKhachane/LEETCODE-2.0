public class ParRecu {
    public static void f(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        f(n-1,sum+n);
    }
    public static void main(String[] args){
        // System.out.println(f(3,0));
        f(3,0);
    }
}
