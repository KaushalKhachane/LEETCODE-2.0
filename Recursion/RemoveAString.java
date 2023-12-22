public class RemoveAString {

    public static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if (c == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + c, up.substring(1));
        }
    }

    public static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char c = up.charAt(0);
        if (c == 'a') {
            return skip2(up.substring(1));
        } else {
            return c + skip2(up.substring(1));
        }
    }

    public static String skipapple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipapple(up.substring(5));
        } else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }

    public static String skipapp(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipapp(up.substring(3));
        }else{
            return up.charAt(0) + skipapp(up.substring(1));
        }
    }

    public static void main(String[] args) {
        // skip("", "baccdha");
        // System.out.println(skip2("apple"));
        System.out.println(skipapp("youareappamezing"));
    }

}
