class RandomizedSet {

    HashSet<Integer> hs;
    ArrayList<Integer> al;
    
    java.util.Random rand = new java.util.Random();
    
    public RandomizedSet() {
        hs = new HashSet<>();
        al = new ArrayList<>(hs);
    }
    
    public boolean insert(int val) {
        
        if(hs.add(val)) {
            al.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        
        if(hs.remove(val)) {
            al.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
    
        int idx = rand.nextInt(al.size());
        return al.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */