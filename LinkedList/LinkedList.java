public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == tail) {
            head = tail = newNode; 
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is empty");
            return;
        } else {
            System.out.println("Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("end\n");
        }

    }

    public void addInMiddle(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (count == idx - 1) {
                newNode.next = temp.next;
                ;
                temp.next = newNode;
                break;
            } else {
                temp = temp.next;
                count++;
            }
        }
        size++;
    }

    public int sizeLL() {
        return size;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty can't remove first");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty can't remove last element");
            return -1;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }

    public int searchLL(int key) {
        if (size == 0) {
            System.out.println("Empty LL can't search");
            return -1;
        } else {
            int i = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i += 1;
            }
            return i;
        }
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverseList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthLastNode(int n) {
        int s = 0; // size
        Node temp = head;

        while (temp != null) {
            s++;
            temp = temp.next;
        }
        if (s == 0) {
            System.out.println("LL is empty can't remove " + n + "th element from LL");
            return;
        }
        if (size == 1) {
            head = tail = null;
            return;
        }
        // delete the first node
        if (n == s) {
            head = head.next;
        }

        // 1->2->3->4->5

        Node prev = head;
        int i = 1;
        int iToFind = s - n;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        size--;
        return;

    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node midNode = findMid(head);

        // reverse right half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node deleteMiddle() {
        // 2 pointer approach 
        Node slow = head;
        Node fast = head;
        Node prev = null;

        if(head == null || head.next == null){
            return null;
        }

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev != null){
            prev.next = slow.next;
        }

        return head;
        
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null     && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public static Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);
        // left and right MS
        Node rightNode = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightNode);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // head = new Node(10);
        // Node temp = new Node(40);
        // head.next = temp;
        // head.next.next = new Node(30);
        // head.next.next.next = temp;
        // 10->40->
        list.addLast(10);
        list.addLast(20);
        list.addLast(20);
        list.addLast(10);

        // list.addInMiddle(1, 15);

        // list.printList();
        // System.out.println("Removed Element: " + list.removeFirst());
        // System.out.println("Removed Element: " + list.removeFirst());
        // System.out.println("Removed Element: " + list.removeFirst());
        // System.out.println("Removed Element: " + list.removeFirst());

        // System.out.println("Removed Last Element: " + list.removeLast());
        // System.out.println("Removed Last Element: " + list.removeLast());
        // list.printList();
        // System.out.println("Search Done element found at index(0 based indexing): " +
        // list.recursiveSearch(15));
        // if (list.recursiveSearch(35) == -1) {
        // System.out.println("KEY NOT FOUND!!! ");
        // }
        // System.out.println("Size: " + list.sizeLL());

        // System.out.println("Reverse List: ");
        // list.reverseList();
        // list.removeNthLastNode(2);
        // list.removeNthLastNode(1);
        // list.printList();
        // list.removeNthLastNode(3);
        // list.removeNthLastNode(2);
        list.printList();
        list.mergeSort(head);
        list.printList();
        list.deleteMiddle();
        list.printList();
        // System.out.println(list.isCycle());
        // removeCycle();
        // System.out.println(list.isCycle());
        

    }

}
