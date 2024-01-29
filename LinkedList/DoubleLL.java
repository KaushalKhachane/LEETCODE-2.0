public class DoubleLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode; 
    }

    public static int removeFirst(){
        if(head == null){
            System.out.println("DLL is Empty");
            return Integer.MAX_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        System.out.println(removeFirst());
System.out.println(removeFirst());
        print();
    }

}
