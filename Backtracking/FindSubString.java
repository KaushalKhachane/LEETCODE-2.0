public class FindSubString {

    public static void findSubsets(String str, int i, String ans) {
        // Base case
        if (i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // Recursion
        // Choice 1: Include the current character
        findSubsets(str, i + 1, ans + str.charAt(i));

        // Choice 2: Exclude the current character
        findSubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}
