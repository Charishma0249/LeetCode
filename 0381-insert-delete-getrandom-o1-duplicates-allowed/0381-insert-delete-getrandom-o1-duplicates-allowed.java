import java.util.*;

class RandomizedCollection {

    ArrayList<Integer> al;
    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    Random rand = new Random();
    
    public RandomizedCollection() {
        al = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean result = true;
        if(hm.containsKey(val)) {
            arr = hm.get(val);
            if(arr.size()==0)
                result = true;
            else 
                result = false;
        }
        
        arr.add(val);
        hm.put(val, arr);
        al.add(val);
        
        return result;
    }
    
    public boolean remove(int val) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int s;
        if(hm.containsKey(val) && hm.get(val).size()!=0) {
            arr = hm.get(val);
            s = arr.size();
            
            al.remove(Integer.valueOf(arr.get(s-1)));
            arr.remove(s-1);
            
            return true;
        }
        
        return false;
    }
    
    public int getRandom() {
        return al.get(rand.nextInt(al.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */