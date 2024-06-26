import java.util.*;

public class LongestSuccesive {
    static int longestSuccessiveElements(int []a){
        Set<Integer> s = new HashSet<>();
        int longest = 1;

        for(int i = 0; i < a.length; i++){
            s.add(a[i]);
        }
        
        for(int it : s){
            if(!s.contains(it-1)){
                int cnt = 1;
                int x = it;

                while(s.contains(x + 1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;

    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
