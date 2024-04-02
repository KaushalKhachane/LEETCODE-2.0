public class SortedOrNot {
    
    public static boolean helper(int arr[], int index){
        if(index == arr.length - 1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }

        return helper(arr, index + 1);
    }
    public static void main(String[] args) {
        // SortedOrNot obj = new SortedOrNot();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(helper(array, 0)); // Output: true
    }
}
