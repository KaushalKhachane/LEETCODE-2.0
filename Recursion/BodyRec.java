public class BodyRec {
    static int f(int n){
        if(n == 0){
            return 0;
        }

        return n + f(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(f(3));
    }
}
