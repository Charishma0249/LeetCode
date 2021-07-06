class RandomizedSet {

    HashSet<Integer> hs;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
        hs = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        if(hs.contains(val))
            return false;
        
        hs.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        
        if(!hs.contains(val))
            return false;
        
        hs.remove(val);
        return true;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        
        double rdm = Math.random();
        //System.out.println(rdm);
        int i = (int)(rdm*hs.size()+1);
        
        //System.out.println(i);
        Iterator<Integer> itr = hs.iterator();
        while(i>1)
        {
            itr.next();
            i--;
        }
        
        return itr.next();
            
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */