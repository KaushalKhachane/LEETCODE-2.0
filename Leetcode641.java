class MyCircularDeque {
    int cq[];
    int cap;
    int front;
    int rear;
    int size;
    

    public MyCircularDeque(int k) {
        this.cap = k;
        this.front = -1;
        this.rear = -1;
        this.size = 0;
        this.cq = new int[this.cap];
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }else{
            front = (front -1 + cap) % cap;
        }
        cq[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            rear = 0;
            front = 0;
        }else{
            rear = (rear + 1) % cap;
        }

        cq[rear] = value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        if(front== rear){
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%cap;
        }
        size--;
        return true;
    }
    

    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            rear = (rear-1+cap) % cap;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return cq[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return cq[rear];
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public boolean isFull() {
        return (size == cap);
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */