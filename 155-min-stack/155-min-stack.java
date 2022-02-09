class MinStack {

    ArrayList<Integer> al;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public MinStack() {
        al = new ArrayList<>();
    }
    
    public void push(int val) {
        pq.add(val);
        al.add(val);
    }
    
    public void pop() {
        int val = al.get(al.size()-1);
        pq.remove(val);
        al.remove(al.size()-1);
    }
    
    public int top() {
        return al.get(al.size()-1);
    }
    
    public int getMin() {
        return pq.peek();
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