class LRUCache {

    LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
    //ArrayList<Integer> al = new ArrayList<>();
    
    int cap;
    public LRUCache(int capacity) {
        cap = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)) {
            int k = key;
            int v = hm.get(key);
            hm.remove(k,v);
            hm.put(k,v);
            return v;
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        int k, v;
        if(hm.size()<cap) {
            if(!hm.containsKey(key))
                hm.put(key, value);
            else {
                k = key;
                v = hm.get(key);
                 hm.remove(k, v);
                hm.put(key,value);
            }
        }
        else {
            
            if(!hm.containsKey(key)) {
                Map.Entry<Integer, Integer> entry = hm.entrySet().iterator().next();
                k = entry.getKey();
                v = entry.getValue();
            }
            else {
                k = key;
                v = hm.get(key);
            }
            hm.remove(k, v);
            hm.put(key,value);
        }
    }
        
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */