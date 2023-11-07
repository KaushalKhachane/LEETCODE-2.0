import java.util.Stack;
public class PreviousGreatest {
    
    static void prevoiseGreatestElement(int arr[], int n){
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        System.out.print("-1"+" ");

        for(int i = 1; i < n; i++){
            while(!s.empty() && s.peek() <= arr[i]){
                s.pop();
            }
            int prevG = s.empty() ? -1 : s.peek();
            System.out.print(prevG+ " ");
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {20,30,10,5,15};
        int n = arr.length;
        prevoiseGreatestElement(arr, n);
    }
}
