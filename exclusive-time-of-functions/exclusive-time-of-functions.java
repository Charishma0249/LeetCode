class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        
        ArrayList<String[]> al = new ArrayList<>();
        ArrayList<Integer> jobs = new ArrayList<>();
        
        for(int i=0; i<logs.size(); i++) {
            String[] fn = logs.get(i).split(":");
            al.add(fn);
        }
       //System.out.println("size = "+al.size());
        hm.put(Integer.valueOf(al.get(0)[0]), Integer.valueOf(al.get(0)[2]));
        jobs.add(Integer.valueOf(al.get(0)[0]));
        for(int i=1; i<al.size(); i++) {
            
            String[] curr = al.get(i);
            String[] prev = al.get(i-1);
            
            int currId = Integer.valueOf(curr[0]);
            int prevId = Integer.valueOf(prev[0]);
            
            String currState = curr[1];
            String prevState = prev[1];
            
            int currTime = Integer.valueOf(curr[2]);
            int prevTime = Integer.valueOf(prev[2]);
            
           // System.out.println(currId);
            if(currState.equals("start")) {
                
                if(prevState.equals("start")) {
                    int temp = hm.get(prevId);
                    int diff = currTime - prevTime;
                    hm.put(prevId, temp+diff);
                    
                }
                else {
                    if(!jobs.isEmpty()) {
                        int id = jobs.get(jobs.size()-1);
                        int diff = currTime-prevTime;
                       // System.out.println("id = "+id);
                        int temp = hm.get(id);
                        hm.put(id, temp+diff-1);
                    }
                }
                if(!hm.containsKey(currId)) 
                        hm.put(currId, 0);
                jobs.add(currId);
            }
            else {
                // for(int k=0; k<jobs.size(); k++) 
                //     System.out.println("jobs = "+jobs.get(k));
                if(prevState.equals("start")) {
                    if(currId==prevId) {
                        int time = hm.get(prevId);
                        int diff = currTime-prevTime;
                        hm.put(prevId, time+diff+1);
                    }
                    else {
                        int time = hm.get(prevId);
                        int diff = currTime-prevTime;
                        hm.put(prevId, time+diff);
                        
                        time = hm.get(currId);
                        hm.put(currId, time+diff);
                    }
                }
                else {
                    int time = hm.get(currId);
                    int diff = currTime-prevTime;
                    hm.put(currId, time+diff);
                }
                
                int indx = jobs.lastIndexOf(currId);
                jobs.remove(indx);
            }
        }
               
        int[] res = new int[n];
        for(int i=0; i<hm.size(); i++) {
            if(hm.containsKey(i))
                res[i] = hm.get(i);
            else
                res[i] = 0;
           // System.out.println(res[i]);
        }
               
        return res;
    }
}