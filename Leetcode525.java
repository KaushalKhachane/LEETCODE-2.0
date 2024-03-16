class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int count = 0;
        int maxlen = 0;

        for(int i = 0; i < nums.length; i++){
            count += (nums[i] == 1) ? 1 : -1;  // if 1 in series then add 1 otherwise add 0

            if(map.containsKey(count)){
                maxlen = Math.max(maxlen,i - map.get(count));
            }else{
                map.put(count, i);
            }
        }
        return maxlen;
    }
}