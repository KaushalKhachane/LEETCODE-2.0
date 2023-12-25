class Solution {
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        sum(answer, new ArrayList<>(), candidates, target, 0);
        return answer;
    }

    public void sum(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remainingTarget, int index) {
        if (remainingTarget == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (index == candidates.length) {
            return;
        }

        // "Pick" the current element
        if (candidates[index] <= remainingTarget) {
            temp.add(candidates[index]);
            sum(ans, temp, candidates, remainingTarget - candidates[index], index);
            temp.remove(temp.size() - 1); // backtrack
        }

        // "Not pick" the current element and move to the next
        sum(ans, temp, candidates, remainingTarget, index + 1);
    }
}