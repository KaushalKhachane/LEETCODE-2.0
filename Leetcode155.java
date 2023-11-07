class MinStack {

    Stack<Integer> s;
    Stack<Integer> ms;

    public MinStack() {
        s = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(ms.empty() || val <= ms.peek()){
            ms.push(val);
        }
    }
    
    public void pop() {
        if(!s.empty()){
            if(s.peek().equals(ms.peek())){
                ms.pop();
            }
            s.pop();
        }
    }
    
    public int top() {
        if(!s.empty()){
            return s.peek();
        }else {
            throw new IllegalStateException("Stack is empty");
        }
    }
    
    public int getMin() {
        if(!ms.isEmpty()){
            return ms.peek();
        }else {
            throw new IllegalStateException("Stack is empty");
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */