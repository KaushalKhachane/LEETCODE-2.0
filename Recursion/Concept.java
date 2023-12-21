public class Concept {
    static void func(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // func(n--);
        func(--n);
    }
    public static void main(String[] args) {
        func(5);
    }
}
