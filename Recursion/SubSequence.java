import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    static void subSeq(ArrayList<Integer> current, int[] remaining, ArrayList<ArrayList<Integer>> res) {
        if (remaining.length == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        // Include the first element in the current subsequence
        ArrayList<Integer> withElement = new ArrayList<>(current);
        withElement.add(remaining[0]);
        subSeq(withElement, Arrays.copyOfRange(remaining, 1, remaining.length), res);

        // Exclude the first element from the current subsequence
        subSeq(current, Arrays.copyOfRange(remaining, 1, remaining.length), res);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        subSeq(new ArrayList<>(), new int[]{1, 2, 3}, res);
        System.out.println(res);
    }
}
