class MyQueue {

    Stack<Integer> stk1;
    Stack<Integer> stk2;
    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    
    public void push(int x) {
        transfer(stk2, stk1);
        stk1.push(x);
    }
    
    public int pop() {
        transfer(stk1, stk2);
        return stk2.pop();
    }
    
    public int peek() {
        transfer(stk1, stk2);
        return stk2.peek();
    }
    
    public boolean empty() {
        if(stk1.empty() && stk2.empty())
            return true;
        return false;
    }
    
    public void transfer(Stack<Integer> stk1, Stack<Integer> stk2) {
        while(!stk1.empty()) {
           int n= stk1.pop();
           stk2.push(n);
        }
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