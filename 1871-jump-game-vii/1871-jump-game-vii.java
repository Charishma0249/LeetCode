class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
        if(s.charAt(s.length()-1)=='1')
            return false;
        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);
        int far = 0;
        while(!qu.isEmpty()){
            
            int idx = qu.poll();
            if(idx==s.length()-1)
                return true;
            int max = Math.max(far+1, minJump+idx);
            
            for(int i=max; i<=idx+maxJump && i<s.length(); i++){
                
                if(s.charAt(i)=='0' && i!=far)
                    qu.add(i);
                
                far = Math.max(far, i);
            }
                
        }
        
        return false;
    }
    
//     public boolean rec(String s, int minJump, int maxJump, int idx){
        
//         boolean res=false;
        
//         // if(idx>=s.length())
//         //     return false;
//         if(idx==s.length()-1)
//             return true;
        
//         if(s.charAt(idx)=='1')
//             return false;
//         for(int i=idx+minJump; i<=idx+maxJump && i<s.length(); i++){
//             res = rec(s, minJump, maxJump, i);
//             if(res) {
//                 return true;
//             }
//         }
//         return res;
//     }
}