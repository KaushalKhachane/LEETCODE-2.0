class Solution {
    

    public int getWinner(int[] arr, int k) {
        int c = 0;
        int n = arr.length;

        if (k >= n) {
            return Arrays.stream(arr).max().getAsInt(); // Return the maximum element if k is greater than or equal to n
        }

        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                c = 1;
            }else {
                c++;
            }

            if (c == k) {
                return max;
            }
        }

        return  max;        
    }
}