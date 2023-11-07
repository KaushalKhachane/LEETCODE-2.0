public class SerachInRotatedSortedArray {

    public static int search(int arr[], int target, int si , int ei){
        // base case
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei - si) / 2;

        if(arr[mid] == target){
            return mid;
        }

        //line 1
        if(arr[si] <= mid){
            // case 1: left of mid
            if(arr[si] <= target && target <= mid){
                return search(arr, target, si, mid-1);
            }
            else{
                // case b: right 
                return search(arr, target, mid+1, ei);
            }
        }else{
            // line 2
            if(arr[mid] <= target && target <= arr[ei]){
                // case c: right
                return search(arr, target, mid+1, ei)''
            }else{
                // case d : left
                return search(arr, target, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int targetIndex = search(arr, target, 0, arr.length-1);
        System.out.println(targetIndex);
    }
}