import java.util.ArrayList;

public class SubString {
    public static ArrayList<String> printSub(String p, String up){
        if(up.isEmpty()){
            // System.out.println(p);
            ArrayList<String> res = new ArrayList<String>();
            res.add(p);
            return res;
        }
        char c = up.charAt(0);
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();

        left.addAll(printSub(p+c, up.substring(1)));
        
        right.addAll(printSub(p, up.substring(1)));
        
        left.addAll(right);

        return left;
    }

    public static ArrayList<String> printSub2(String p, String up, ArrayList<String> res) {
        if (up.isEmpty()) {
            res.add(p);
            return res;
        }

        char c = up.charAt(0);

        // Include the result of the first recursive call directly into the passed ArrayList
        printSub2(p + c, up.substring(1), res);

        // Include the result of the second recursive call directly into the passed ArrayList
        printSub2(p, up.substring(1), res);

        return res;
    }

    public static void main(String[] args) {
        // String str = "abc";
        // ArrayList<String> res = new ArrayList<String>();
        // System.out.println(printSub("", str));
        // System.out.println(res);

        // ----------------------------------------------------------------

        String str = "abc";
        ArrayList<String> res = new ArrayList<>();

        // Call the method with the initial empty string and the shared ArrayList
        printSub2("", str, res);

        // Print the final result
        System.out.println(res);
    }
}
