import static java.util.Collections.reverseOrder;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int res = 0;
        
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        
        for(int i=0; i<boxTypes.length; i++)
        {
            //ArrayList<Integer> al = new ArrayList<>();
            
            int count = boxTypes[i][0];
            
            if(lhm.containsKey(boxTypes[i][1]))
                count = count + lhm.get(boxTypes[i][1]);
            
            lhm.put(boxTypes[i][1], count);
        }
        
        Iterator<Map.Entry<Integer, Integer>> itr = lhm.entrySet()
            .stream()
            .sorted(reverseOrder(Map.Entry.comparingByKey())).iterator();
        
        int i = truckSize;
        
        while(i>=1 && itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();
            
            int val = entry.getValue();
           // System.out.println(entry.getKey());
            
            if(val>i)
                res = res + i*entry.getKey();
            else
                res+=val*entry.getKey();
            
            i = i-val;
        }
        
        return res;
    }
}