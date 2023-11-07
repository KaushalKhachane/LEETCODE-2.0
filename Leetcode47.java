class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        findUniquePermute(nums, used, curr, result);
        return result;
    }

    public void findUniquePermute(int []nums, boolean []used, List<Integer> curr, List<List<Integer>> result){

        // base case
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        Set<Integer> usedSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!used[i] && !usedSet.contains(nums[i])){
                used[i] = true;
                curr.add(nums[i]);
                usedSet.add(nums[i]);

                findUniquePermute(nums, used, curr, result);
                used[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }
}