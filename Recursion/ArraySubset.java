import java.util.*;

public class ArraySubset {

    public static List<List<Integer>> subset(int []arr){
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                System.out.println("after outer "+internal);
                internal.add(num);
                System.out.println("after add no."+internal);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
        
    }
}
