public class SortedCheck {
    static boolean check(int arr[]){
        int n = arr.length;
        return helper(arr, 0);
    }
    static boolean helper(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && helper(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,7,8};
        System.out.println(check(arr));
    }
}
