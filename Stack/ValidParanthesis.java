import java.util.Stack;

public class ValidParanthesis {

    public static String checkString(String s){
        Stack<Integer> st = new Stack<>();
        boolean remove[] = new boolean[s.length()];

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }else if(c == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    remove[i] = true;
                }
            }
        }

        while (!st.isEmpty()) {
            remove[st.pop()] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!remove[i]){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        String res = checkString(s);
        System.out.println(res);
    }
}
