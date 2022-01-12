class TimeMap {

    Map<String, TreeMap<Integer, String>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>(){
            
            @Override
            public int compare(Integer a, Integer b) {
                if(a<b)
                    return 1;
                else if(a>b)
                    return -1;
                return 0;
            }
        });
        // TreeMap<Integer, String> tm = new TreeMap<>();
        if(hm.containsKey(key))
            tm = hm.get(key);
        tm.put(timestamp, value);
        hm.put(key, tm);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tm = hm.get(key);
        if(tm==null)
            return "";
        for(Map.Entry<Integer, String> entry : tm.entrySet()) {
            if(entry.getKey()<=timestamp) {
                return entry.getValue();
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */