import java.util.ArrayList;
import java.util.List;

public class FirstCombinationalSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        sum(answer, new ArrayList<>(), candidates, target, 0);
        return answer;
    }

    public static boolean sum(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remainingTarget, int index) {
        if (index == candidates.length) {
            if (remainingTarget == 0) {
                ans.add(new ArrayList<>(temp));
                return true;
            } else {
                return false;
            }
        }

        // "Pick" the current element
        if (candidates[index] <= remainingTarget) {
            temp.add(candidates[index]);
            if (sum(ans, temp, candidates, remainingTarget - candidates[index], index) == true) {
                return true;
            }
            temp.remove(temp.size() - 1); // backtrack
        }

        // "Not pick" the current element and move to the next
        if(sum(ans, temp, candidates, remainingTarget, index + 1) == true){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = 3;
        int sum = 2;
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(sum(ans, new ArrayList<Integer>(), arr, sum, 0));
        System.out.println(ans);
    }
}
