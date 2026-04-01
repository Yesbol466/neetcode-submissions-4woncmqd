class MyStack {

    Queue<Integer> queue;
    Queue<Integer> queue2;

    public MyStack() {
        queue = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        //queue must be reversed

        queue2.add(x);

        while(!queue.isEmpty()){
            queue2.add(queue.poll()); //here queue will be cleaned
        }

        Queue<Integer> temporary = queue;
        queue = queue2;
        queue2 = temporary; //will be cleaned for the next x value
        
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */