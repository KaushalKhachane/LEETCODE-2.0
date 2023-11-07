import java.util.Arrays;
import java.util.Comparator;

public class Activity{
    int start;
    int finish;
    Activity(int s, int f){
        this.start  = s;
        this.finish = f;
    }

    static class MyCmp implements Comparator<Activity>{
        public int compare(Activity a, Activity b){
            return a.start - b.start;
        }
    }

    public static int maxActivity(Activity []arr){
        Arrays.sort(arr, new MyCmp());
        // Arrays.sort(arr, new MyCmp());
        int res = 1;
        int prev = 0;

        for(int curr = 0; curr < arr.length; curr++){
            if(arr[curr].start >= arr[prev].finish){
                res++;
                prev = curr;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Activity[] arr = {
            new Activity(12, 25),
            new Activity(10, 20),
            new Activity(20, 30)
        };
        System.out.println(maxActivity(arr));
    }
}