// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//     List<List<Integer>> list = new ArrayList<>();
//     backtrack(list, new HashSet<>(), nums, 0);
//     return list;
//     }

//     private void backtrack(List<List<Integer>> list , Set<Integer> tempList, int [] nums, int start){
//         list.add(new ArrayList<>(tempList));
//         for(int i = start; i < nums.length; i++){
//             tempList.add(nums[i]);
//             backtrack(list, tempList, nums, i + 1);
//             tempList.remove(tempList.size() - 1);
//         }
//     }
// }

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums); // Sort the input array to handle duplicates correctly
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates to avoid duplicate subsets
            }
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
}
