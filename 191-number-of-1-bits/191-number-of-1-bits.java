public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        
        String bin = Integer.toBinaryString(n);
        for(char c : bin.toCharArray()){
            if(c=='1')
                res++;
        }
//         if(n<0)
//             flag=true;
        
//         while(num>0){
//              System.out.println(num);
//             int r = num%2;
//             num = num/2;
            
//             if(flag && r==0){
//                  System.out.println("r = "+r);
//                 res++;
//             }
//             else if(r==1){
//                  System.out.println("r = "+r);
//                 res++;
//             }
//         }
        return res;
    }
}