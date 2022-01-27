class MyQueue {

    Stack<Integer> stk1;
    Stack<Integer> stk2;
    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    
    public void push(int x) {
        if(stk1.empty() && !stk2.empty()) {
            while(!stk2.empty()) {
                int n = stk2.pop();
                stk1.push(n);
            }
        }
        stk1.push(x);
    }
    
    public int pop() {
        
        while(!stk1.empty()) {
           int n= stk1.pop();
           stk2.push(n);
        }
        
        return stk2.pop();
    }
    
    public int peek() {
        while(!stk1.empty()) {
           int n= stk1.pop();
           stk2.push(n);
        }
        
        return stk2.peek();
    }
    
    public boolean empty() {
        if(stk1.empty() && stk2.empty())
            return true;
        return false;
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