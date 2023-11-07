class MyQueue {

    Stack<Integer> s;
    Stack<Integer> e;

    public MyQueue() {
        s = new Stack<>();
        e = new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        if(e.empty()){
            while(!s.empty()){
                e.push(s.pop());    
            }
        }
        return e.pop();
    }
    
    public int peek() {
        if(e.empty()){
            while(!s.empty()){
                e.push(s.pop());    
            }
        }
        return e.peek();
    }
    
    public boolean empty() {
        return e.empty() && s.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */