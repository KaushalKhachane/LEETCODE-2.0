class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        sum(answer, new ArrayList<>(), candidates, target, 0);
        return answer;
    }

    public void sum(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int index){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(candidates[i] <= target){
                temp.add(candidates[i]);
                sum(ans, temp, candidates, target - candidates[i], i);
                temp.remove(temp.size() - 1); //backtrack
            }
        }
    }
}