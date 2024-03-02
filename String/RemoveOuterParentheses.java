public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' && openCount++ > 0) {
                result.append(c);
            }
            if (c == ')' && openCount-- > 1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "((abc))";
        String output = removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
