class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) 
    {
        int len = values.length;
        
        for(int i=0;i<len-1;i++)
        {
            for(int j =i+1; j<len; j++)
            {
                if(values[i]<values[j])
                {
                    int temp = values[j];
                    values[j] = values[i];
                    values[i] = temp;
                    
                    temp = labels[j];
                    labels[j] = labels[i];
                    labels[i] = temp;
                }
            }
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res =0, c=0;
        
        for(int i=0;i<len && c<num_wanted;i++)
        {
            int l = labels[i];
            
            //System.out.println(l);
            if(!hm.containsKey(l))
            {
                res+=values[i];
                hm.put(l, 1);
                c++;
            }
            else
            {
                if(hm.get(l)<use_limit)
                {
                    res+=values[i];
                    int count = hm.get(l);
                    hm.put(l, count+1);
                    c++;
                }
            }
        }
        
        return res;
    }
}