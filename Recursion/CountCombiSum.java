import java.util.*;

public class CountCombiSum {
    public static int sum(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remainingTarget,
            int index) {
        if (index == candidates.length) {
            if (remainingTarget == 0) {
                ans.add(new ArrayList<>(temp));
                return 1;
            } else {
                return 0;
            }
        }

        // "Pick" the current element
        int left = 0;
        if (candidates[index] <= remainingTarget) {
            temp.add(candidates[index]);
            left = sum(ans, temp, candidates, remainingTarget - candidates[index], index);
            
            temp.remove(temp.size() - 1); // backtrack
        }

        // "Not pick" the current element and move to the next
        int right = sum(ans, temp, candidates, remainingTarget, index + 1);

        return left + right;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int sum = 2;
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(sum(ans, new ArrayList<Integer>(), arr, sum, 0));
    }
}
