import java.util.Stack;

public class BalancedParanthesis {

    static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            switch (c){
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isBalanced(s));
    }

}
