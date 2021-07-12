class Solution {
    public int numRabbits(int[] answers) {
        
       // Arrays.sort(answers);
        int res = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<answers.length;i++)
        {
            int count = 1;
            if(hm.containsKey(answers[i]))
                count = hm.get(answers[i])+1;
            
            hm.put(answers[i], count);
        }
        
        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();
            
            //System.out.println(entry.getKey());
            // if(entry.getKey()==0)
            //     res+=entry.getValue();
            // else
            //     res+=entry.getKey()+1;
            
            int key = entry.getKey();
            int val = entry.getValue();
            int quo, rem;
            
            if(key+1<val)
            {
                rem = val%(key+1);
                quo = val/(key+1);
                res+= quo*(key+1);
                
                if(rem!=0)
                    res+=key+1;
            }
            else
            {
                res+=key+1;
            }
            
                
        }
        
        return res;
    }
}