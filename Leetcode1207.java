class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        // map stored element and count of that element
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int count: map.values()){
            if(!set.add(count)){
                return false;
            }
        }
        return true;

    }
}