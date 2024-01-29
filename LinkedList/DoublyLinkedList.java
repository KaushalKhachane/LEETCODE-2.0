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
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirstNode(int data) {
        Node nwNode = new Node(data);
    
        if (head == null) {
            head = tail = nwNode;
            size++;
            return;
        }
    
        nwNode.next = head;
        head.prev = nwNode;  // Fix: update the prev pointer of the old head
        nwNode.prev = null;  // Fix: set the prev pointer to null for the first node
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
        if (head != null) {  // Fix: check if the new head is not null
            head.prev = null;
        }
        size--;
        return out;
    }
    

    public static void print() {
        System.out.println("Printing List");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        addFirstNode(10);
        addFirstNode(20);
        print();
        System.out.println(removeFirstNode());
        // System.out.println("removed -> "+removeFirstNode());
        print();
    }
}
