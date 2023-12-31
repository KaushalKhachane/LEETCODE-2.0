class Solution {
  
    public static void swap(int[] arr,int x,int y){
      int temp=arr[x];
      arr[x]=arr[y];
      arr[y]=temp;
    }
  
    public int firstMissingPositive(int[] nums) {
      int i;
      for(i=0;i<nums.length;i++){
        while(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
          swap(nums,i,nums[i]-1);
        }
      }
      for(i=0;i<nums.length;i++){
        if(nums[i]!=i+1)return i+1;
      }
      return i+1;
    }
  }