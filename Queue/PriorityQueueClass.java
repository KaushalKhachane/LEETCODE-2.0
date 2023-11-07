import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        // min heap by default in java
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(15);

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.peek() + " ");
            priorityQueue.poll();
        }
    }
}