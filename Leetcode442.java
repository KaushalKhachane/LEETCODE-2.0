class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // map stored element and count of that element
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }
        List<Integer> res= new ArrayList<>();
        
        // for(Map.Entry<Integer, Integer> ele: map.entrySet()){
        //     if(ele.getValue() > 1){
        //         res.add(ele.getKey());
        //     }
        // }
        // return res;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int cnt = 1;
            while(i < nums.length-1 && nums[i] == nums[i+1]){
                res.add(nums[i]);
                i++;
                break;
            }
        }
        return res;
    }
}