public class CircularArrayDeque<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularArrayDeque(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void addFront(T item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot addFront.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        array[front] = item;
        size++;
    }

    public void addRear(T item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot addRear.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        array[rear] = item;
        size++;
    }

    public T removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot removeFront.");
            return null;
        }

        T removedItem = (T) array[front];
        array[front] = null;

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return removedItem;
    }

    public T removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot removeRear.");
            return null;
        }

        T removedItem = (T) array[rear];
        array[rear] = null;

        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
        return removedItem;
    }

    public T getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return null;
        }
        return (T) array[front];
    }

    public T getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return null;
        }
        return (T) array[rear];
    }

    public static void main(String[] args) {
        CircularArrayDeque<Integer> deque = new CircularArrayDeque<>(5);

        deque.addFront(1);
        deque.addFront(2);
        deque.addRear(3);
        deque.addRear(4);

        System.out.println("Front of the deque: " + deque.getFront());
        System.out.println("Rear of the deque: " + deque.getRear());
        System.out.println("Size of the deque: " + deque.size());

        deque.removeFront();
        deque.removeRear();

        System.out.println("Front of the deque: " + deque.getFront());
        System.out.println("Rear of the deque: " + deque.getRear());
        System.out.println("Size of the deque: " + deque.size());
    }
}
