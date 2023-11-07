class MyCircularQueue {

    int cq[];
    int cap;
    int front;
    int rear;
    int size;

    public MyCircularQueue(int k) {
        this.cap = k;
        this.cq = new int[this.cap];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }else{
            rear = (rear+1)%cap;
        }
        cq[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%cap;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return cq[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return cq[rear];
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public boolean isFull() {
        return (size==cap);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */