class MovingAverage {

    ArrayList<Integer> al;
    int counter = 0,sum=0,size;
    double avg = 0;
    
    public MovingAverage(int size) {
        this.size = size;
        al = new ArrayList<>(size);
    }
    
    public double next(int val) {
        if(counter==size) {
            sum -= al.get(0);
            al.remove(0);
            sum+=val;
            avg = (double)sum/size;
            counter--;
        }
        else {
            sum += val;
            
            avg = (double)sum/(counter+1);
        }
        al.add(val);
        counter++;
        return avg;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */