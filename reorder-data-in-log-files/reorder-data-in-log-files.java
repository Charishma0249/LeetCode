class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        int len = logs.length;
        
        ArrayList<String> dig = new ArrayList<>();
        String[] res = new String[len];
        
        ArrayList<String> let = new ArrayList<>();
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        
        for(int i=0; i<len; i++) {
            
            String arr[] = logs[i].split("\\s+");
            if(arr[1].charAt(0)>='0' && arr[1].charAt(0)<='9')
                dig.add(logs[i]);
            else {
                
                int indx = logs[i].indexOf(" ");
                String str = logs[i].substring(indx+1, logs[i].length());
                
                if(!let.contains(str))
                    let.add(str);
                
                ArrayList<String> temp = new ArrayList<>();
                if(hm.containsKey(str))
                    temp = hm.get(str);
                
                temp.add(logs[i].substring(0, indx+1));
                hm.put(str, temp);
            }
        }
        
        int i=-1;
        Collections.sort(let);
        
        for(int j=0; j<let.size(); j++) {
            
            ArrayList temp = hm.get(let.get(j));
            
            if(temp.size()>1)
                Collections.sort(temp);
            
            for(int k=0; k<temp.size(); k++) {
              //  System.out.println(temp.size());
                StringBuilder sb = new StringBuilder();
                sb.append(temp.get(k) + let.get(j));
                res[++i] = sb.toString();
              //  System.out.println(sb.toString());
            }
        }
        
        for(int j=0; j<dig.size(); j++) {
            
            res[++i] = dig.get(j);
        }
        
        return res;
    }
}

class Pair {
    
    char id;
    String s;
    
    public Pair(char id, String s) {
        this.id = id;
        this.s = s;
    }
}