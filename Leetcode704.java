class Solution {
    public int binary(int []arr, int l, int e,int target){
        while(l <= e){
            int mid = l + e;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                l = mid + 1;
                return binary(arr, l, e, target);
            }else{
                e = mid - 1;
                return binary(arr, l, e, target);
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        return binary(nums, 0, nums.length-1, target);
    }
}