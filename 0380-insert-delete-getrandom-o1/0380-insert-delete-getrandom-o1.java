class RandomizedSet {

    HashSet<Integer> hs;
    java.util.Random rand = new java.util.Random();
    
    public RandomizedSet() {
        hs = new HashSet<>();
    }
    
    public boolean insert(int val) {
        
        return hs.add(val);
    }
    
    public boolean remove(int val) {
        
        if(hs.contains(val)) {
            hs.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        
        ArrayList<Integer> al = al = new ArrayList<>(hs);
    
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