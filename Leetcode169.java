class Solution {
    public int majorityElement(int[] nums) {

        //OPTIMAL APPROACH (Moore's voting algorithm)
        int n = nums.length;
        int ele = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(cnt == 0){
                ele = nums[i];
                cnt = 1;
            }else if(nums[i] ==  ele){
                cnt++;
            }else{
                cnt--;
            }
        }

        int cnt1 = 0;        
        for(int i = 0; i < n; i++){
            if(nums[i] == ele){
                cnt1++;
            }
        }
        if(cnt1 > n / 2){
            return ele;
        }
        return -1;



        // BETTER APPROACH
        // int n = nums.length;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // //storing the elements with its occurnce:
        // for(int i = 0; i < n; i++){
        //     int value = map.getOrDefault(nums[i],0);
        //     map.put(nums[i], value+1);
        // }

        // //searching for the majority element:
        // for(Map.Entry<Integer, Integer> it : map.entrySet()){
        //     if(it.getValue() > n/2){
        //         return it.getKey();
        //     }
        // }        

        // return -1;

        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];
    }
}