import java.util.ArrayList;

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

    static ArrayList<Integer> findIndexArrayList(int[] arr, int target, int idx, ArrayList<Integer> list){
        if(idx == arr.length){
            return list;
        }

        if(arr[idx] == target){
            list.add(idx);

        }

        return findIndexArrayList(arr, target, idx+1, list);
    }

    static ArrayList<Integer> findIndexArrayList2(int[] arr, int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();

        if(idx == arr.length){
            return new ArrayList<>();
        }

        //  answer for that function call only
        if(arr[idx] == target){
            // list.add(idx);
            list.add(idx);            
        }

        ArrayList<Integer> ansFromBelowCalls = findIndexArrayList2(arr, target, idx+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6,7,8};
        // System.out.println(findIndex(arr, 5, 0));
        // ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res = findIndexArrayList2(arr, 5, 0);
        System.out.println(res);

    }
}
