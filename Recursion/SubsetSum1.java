import java.util.*;

public class SubsetSum1 {

    static void subsetSumsHelper(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumsubSet) {
        if(ind == N){
            sumsubSet.add(sum);
            return;
        }

        //pick the element
        subsetSumsHelper(ind+1, sum+arr.get(ind), arr, N, sumsubSet);

        //not pick the element
        subsetSumsHelper(ind+1, sum, arr, N, sumsubSet);
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> subSubSet = new ArrayList<Integer>();
        subsetSumsHelper(0,0,arr, N,subSubSet);
        Collections.sort(subSubSet);
        return subSubSet;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}
