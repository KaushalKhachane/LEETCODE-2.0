public class ClimbCount {
    static int count(int n){
        if(n == 0){
            return 1;
        }
        if(n  == 1){
            return 1;
        }
        int left = count(n - 1);
        int right = count(n-2);
        return left + right;
    }
    public static void main(String[] args) {
        int res = count(3);
        System.out.println(res);
    }
}
