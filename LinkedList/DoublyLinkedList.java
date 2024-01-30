import java.util.Stack;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        // Constructor for a Node with both data,
        // a reference to the next node, and a
        // reference to the previous node
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            prev = back1;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void addFirstNode(int data) {
        Node nwNode = new Node(data);

        if (head == null) {
            head = tail = nwNode;
            size++;
            return;
        }

        nwNode.next = head;
        head.prev = nwNode; // Fix: update the prev pointer of the old head
        nwNode.prev = null; // Fix: set the prev pointer to null for the first node
        head = nwNode;
        size++;
    }

    public static int removeFirstNode() {
        if (head == null) {
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int out = head.data;
        head = head.next;
        if (head != null) { // Fix: check if the new head is not null
            head.prev = null;
        }
        size--;
        return out;
    }

    public static void addLastNode(int data) {
        Node neNode = new Node(data);

        if (tail == null) {
            head = tail = neNode;
            size++;
            return;
        }

        tail.next = neNode;
        neNode.prev = tail;
        tail = neNode;
        size++;
    }

    public static int removeLastNode() {
        if (tail == null) {
            return -1;
        }
        if (size == 1) {
            return removeFirstNode();
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void print() {

        if (size == 0) { 
            System.out.println("DLL Empty!");
            return;
        }
            System.out.println("Printing List");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("end");

    }

    public static void reverseDLL() {
        Stack<Integer> st = new Stack<>();

        Node temp = head;

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
    }

    public static void printForReverse() {
        System.out.println("Printing List");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    

    public static void array2DLL(int arr[]) {
        head = new Node(arr[0]);
        size++;
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            size++;
            // Update the 'next' pointer of the
            // previous node to point to the new node
            prev.next = temp;

            // Move 'prev' to the newly created node
            // for the next iteration
            prev = temp;
        }
    }

    public static void reverseDLLOptimal() {
        if (head == null) {
            return;
        }

        Node temp = null;
        Node current = head;

        // Swap head and tail pointers
        head = tail;
        tail = current;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
    }

    public static void main(String[] args) {

        // int[] arr = { 12, 5, 6, 8, 4 };
        // Convert the array to a doubly linked list
        // array2DLL(arr);
        System.out.println("size -> " +size);

        addFirstNode(10);
        addFirstNode(20);
        addFirstNode(30);
        addFirstNode(10);
        print();
        
        reverseDLLOptimal();
        
        printForReverse();
        // System.out.println(removeFirstNode());
        // System.out.println("removed -> "+removeFirstNode());
        // System.out.println("Deleted Node => "+removeLastNode());
        // print();
    }
}
