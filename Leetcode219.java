class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                int prevIndex = hmap.get(nums[i]);
                if(Math.abs(i - prevIndex) <= k){
                    return true;
                }
            }
            hmap.put(nums[i],i);
        }
        return false;
    }
}