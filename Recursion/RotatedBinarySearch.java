public class RotatedBinarySearch {

    public static int search(int arr[], int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e - s) / 2;
        if(target ==  arr[mid]){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return search(arr, target, s, mid-1);
            }else{
                return search(arr, target, mid+1, e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);
        
    }
    public static void main(String[] args) {
        int arr[] =  {8, 9, 10, 2, 5, 6};   
        System.out.println(search(arr, 5, 0, arr.length-1));
        // System.out.println((arr.length-1)/2);
    }
}
