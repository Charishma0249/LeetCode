import java.math.BigInteger;

class Solution {
    public int numDifferentIntegers(String word) {
        
        int len = word.length(), j;
        
        List<BigInteger> al = new ArrayList<BigInteger>();
        StringBuilder sb = new StringBuilder(word);
        int k;
        
        for(int i=0;i<len;i++)
        {
            char c = sb.charAt(i);
            if(c<'0' || c>'9')
            {
                //System.out.println(c);
                sb.setCharAt(i, ' ');
            }
        }
        
        for(int i=0; i<len; i++)
        {
            char c=sb.charAt(i);
            
            j=i;
            while(c!=' ' && i<len-1)
            {
                i++;
                c = sb.charAt(i);
            }
            
            if(i==len-1 && c!=' ')
                i++;
            
            if(j!=i)
            {
                BigInteger bi;
                // if(i==len-1 && c!=' ')
                //     bi = new BigInteger(sb.substring(j,i+1));
                // else
                    bi = new BigInteger(sb.substring(j,i));
                if(!al.contains(bi))
                {
                   // System.out.println(bi);
                    al.add(bi);
                }
            }
                
        }
        
        return al.size();
    }
}