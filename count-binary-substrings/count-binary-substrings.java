class Solution {
    public int countBinarySubstrings(String s) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        int count =1, c1 = s.charAt(0)-'0',c2, count2=0, res=0, countTemp=0, flag=-1;
        for(int i=1; i<s.length(); i++) {
            
            c2 = s.charAt(i)-'0';
            
            if(c1==c2) {
                count++;
                flag =1;
            }
            else {
                c1 = c2;
                while(i<s.length() && c2==c1) {
                    
                    count2++;
                    
                    if(i+1<s.length()) {
                    i++;
                    c2 = s.charAt(i)-'0';
                    }
                    else
                        i++;
                }
                
                if(c2!=c1 && i+1>=s.length())
                    res++;
                
                res+=Math.min(countTemp, count);
                res+=Math.min(count, count2);
                count=1;
                countTemp = count2;
                count2=0;
                flag=0;
            }
            
            c1=c2;
        }
        
        if(flag==1) 
            res+=Math.min(countTemp, count);
        
        // ll.add(count);
        
//         count =0;
//         for(int i=0; i<ll.size()-1; i++) {
            
//             int min = Math.min(ll.get(i), ll.get(i+1));
            
//             count+=min;
//         }
        
        //return count;
        
        return res;
    }
}