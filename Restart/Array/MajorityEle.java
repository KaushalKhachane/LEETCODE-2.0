import java.util.*;
public class MajorityEle {

    public static int majorityElement(int []a){
        int n = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int val = map.getOrDefault(a[i], 0);
            map.put(a[i], val+1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > n / 2){
                return it.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
