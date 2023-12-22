import java.util.ArrayList;

public class AsciiPrint {

    public static void main(String[] args) {
        // char c = 'a';
        // System.out.println((char)(c+1));
        // subSequenceAscii("", "abc");
        System.out.println(subSequenceAsciiList("", "abc"));

    }

    static void subSequenceAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequenceAscii(p+ch, up.substring(1));
        subSequenceAscii(p, up.substring(1));
        subSequenceAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subSequenceAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            // System.out.println(p);
            return list;
        }
        char ch = up.charAt(0);
        
        ArrayList<String> first = subSequenceAsciiList(p+ch, up.substring(1));
        ArrayList<String> second = subSequenceAsciiList(p, up.substring(1));
        ArrayList<String> third = subSequenceAsciiList(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }   
}
