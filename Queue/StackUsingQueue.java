class MyStack {
    Queue<Integer> q;
    Queue<Integer> e;
    public MyStack() {
        q = new ArrayDeque<>();
        e = new ArrayDeque<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty()){
            e.offer(q.poll());
            // q.pop();
        }
        q.offer(x);
        while(!e.isEmpty()){
            q.offer(e.poll());
            // e.pop();
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

