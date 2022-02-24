class MaxStack {

    List<Integer> stack;
    int max = Integer.MIN_VALUE;
    
    public MaxStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
        max = Math.max(x, max);
        stack.add(x);
    }
    
    public int pop() {
        int len = stack.size();
        int n = stack.get(len-1);
        
        stack.remove(len-1);
        if(max==n){
            max = Integer.MIN_VALUE;
            
            for(int i=0; i<stack.size(); i++)
                max = Math.max(max, stack.get(i));
        }
        
        return n;
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int peekMax() {
        return max;
    }
    
    public int popMax() {
        int n = max;
        for(int i=stack.size()-1; i>=0; i--){
            if(stack.get(i)==max){
                // System.out.println(max);
                stack.remove(i);
                break;
            }
        }
        max = Integer.MIN_VALUE;
        for(int i=0; i<stack.size(); i++){
            max = Math.max(max, stack.get(i));
        }
        // System.out.println(max);
        return n;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */