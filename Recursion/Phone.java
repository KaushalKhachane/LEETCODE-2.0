import java.util.*;
class Phone {
    public static List<String> letterCombinations(String digits) {
        // ArrayList<String> res = new ArrayList<>();
        return helper("", digits);
    }
    public static ArrayList<String> helper(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        ArrayList<String> res = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        // System.out.print(digit);
        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a'+i);
            res.addAll(helper(p+ch, up.substring(1)));
        }
        return res; 
    } 
    public static void main(String[] args) {
        List<String> res = letterCombinations("23");
        System.out.println(res); 
    }
}