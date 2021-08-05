class Solution {
    public int[][] indexPairs(String text, String[] words) {
        
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int count =0;
        
        for(int i=0; i<words.length; i++)
        {
            String s = words[i];
            int sindx = 0;
            while(text.indexOf(s, sindx)!=-1)
            {
                int indx = text.indexOf(s, sindx);
                int lastindx = indx+s.length()-1;
                
                ArrayList<Integer> al = new ArrayList<>();
                if(hm.containsKey(indx))
                    al = hm.get(indx);
                    
                al.add(lastindx);                
                hm.put(indx, al);
                count++;
                sindx = indx+1;
            }
        }
        
        HashMap<Integer, ArrayList<Integer>> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getKey().compareTo(
                                  i2.getKey()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
        
        int[][] res = new int[count][2];
        int i=0;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : temp.entrySet())
        {
            int key = entry.getKey();
            //System.out.println(key);
            ArrayList<Integer> al = entry.getValue();
            Collections.sort(al);
            
            Iterator<Integer> itr = al.listIterator();
            
            while(itr.hasNext())
            {
                int n = itr.next();
                res[i][0] = key;
                res[i][1] = n;
                i++;
            }
        }
        
        return res;
    }
}