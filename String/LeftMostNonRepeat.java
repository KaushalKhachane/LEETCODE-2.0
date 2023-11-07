public class LeftMostNonRepeat {

    public static int leftMostNonRepeat(String str) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return i;
            }
        }
        return -1;
    }

    public static final int CHAR = 256;

    public static int leftMostNonRepeatingChar(String str) {
        int count[] = new int[CHAR];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(leftMostNonRepeat("kauuskhal"));
    }
}