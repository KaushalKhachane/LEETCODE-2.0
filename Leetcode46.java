class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        findPermutations(nums, used, curr, result);
        return result;
    }

    private void findPermutations(int[] nums, boolean used[], List<Integer> curr,        List<List<Integer>> result){

        // base case
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                curr.add(nums[i]);

                // recursion
                findPermutations(nums, used, curr, result);

                // backtracking
                used[i] = false;
                curr.remove(curr.size()-1);
            }
        }

    }
}