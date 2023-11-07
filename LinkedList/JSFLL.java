import java.util.LinkedList;;
public class JSFLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(10);
        ll.addFirst(5);
        ll.addLast(50);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
