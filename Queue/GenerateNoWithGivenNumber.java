import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNoWithGivenNumber{
    public static void printFirstN(int n){
        Queue<String> q = new ArrayDeque<>();
        q.offer("5");
        q.offer("6");
        for(int i = 0; i < n; i++){
            String cuString = q.poll();
            System.out.println(cuString+" ");
            q.offer(cuString + "5");
            q.offer(cuString + "6");
        }
    }
    public static void main(String[] args) {
     printFirstN(10);   
    }
}