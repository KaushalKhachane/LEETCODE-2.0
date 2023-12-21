public class LinearSearch {
    public static boolean find(int[] arr, int target, int idx){
        if(idx == arr.length) return false;        

        return arr[idx] == target || find(arr, target, idx+1);
    }

    public static int findIndex(int[] arr, int target, int idx){
        if(idx == arr.length) return -1;        

        if(arr[idx] == target){
            return idx;
        }

        return findIndex(arr, target, idx+1);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(findIndex(arr, 5, 0));
    }
}
