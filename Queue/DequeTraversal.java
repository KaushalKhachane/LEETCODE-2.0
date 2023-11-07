import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeTraversal {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        // Forward traversal using an iterator
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Forward: " + element);
        }


        System.out.println("=====================");

        // Backward traversal using a descending iterator
        Iterator<String> descendingIterator = deque.descendingIterator();
        while (descendingIterator.hasNext()) {
            String element = descendingIterator.next();
            System.out.println("Backward: " + element);
        }
    }
}
