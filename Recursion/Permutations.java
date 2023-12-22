import java.util.ArrayList;

public class Permutations {


    public static ArrayList<String> getPermutations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            ans.addAll(getPermutations(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    public static int getPermutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            count = count + getPermutationsCount(f+ch+s, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        // ArrayList<String> res = getPermutations("", "abc");
        // System.out.println(res);

        System.out.println(getPermutationsCount("", "abc"));
    }
}
