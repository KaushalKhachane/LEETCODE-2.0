import org.w3c.dom.Node;

public class QueueUsingLL {
    static class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static class Queue {
        QueueNode front, rear;

        Queue() {
            this.front = null;
            this.rear = null;
        }

        public void enQueue(int x) {
            QueueNode temp = new QueueNode(x);
            if (front == null) {
                front = temp;
            } else {
                rear.next = temp;
            }
            rear = temp;
            rear.next = front;
        }

        public int deQueue() {
            int val;
            if (front == null) {
                System.out.println("Underflow");
                return Integer.MAX_VALUE;
            }
            if (front == rear) {
                val = front.data;
                front = null;
                rear = null;
            } else {
                val = front.data;
                front = front.next;
                rear.next = front;
            }
            return val;
        }

        public void dispQueue() {
            QueueNode temp = front;
            if (front == null) {
                System.out.println("underflow");
            } else {
                System.out.println("Elements are: ");
                if (temp != null) {
                    do {
                        System.out.printf("%d ", temp.data);
                        temp = temp.next;
                    } while (temp != front);
                }
            }

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(10);
        q.deQueue();
        q.dispQueue();
    }
}
