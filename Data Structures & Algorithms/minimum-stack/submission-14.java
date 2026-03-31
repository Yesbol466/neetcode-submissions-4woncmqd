class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> temporary = new Stack<>();

        int min = stack.peek();

        while(!stack.isEmpty()){
            int temporaryValue = stack.pop();
            min = Math.min(min, temporaryValue);
            temporary.push(temporaryValue);
        }

        while(!temporary.isEmpty()){
            stack.push(temporary.pop());
        }

        return min;
    }
}
