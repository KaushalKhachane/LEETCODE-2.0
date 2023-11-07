public class MaxSumSubArray {

    public static int maxSumArray(int arr[], int n){
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;

        int res = maxSumArray(arr, n);
        System.out.println(res);
    }
}
