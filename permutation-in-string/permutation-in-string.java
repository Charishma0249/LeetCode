class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] a = new int[26];
        int[] b = new int[26];
        
        int lena = s1.length();
        int lenb = s2.length();
        
        if(lena>lenb)
            return false;
        
        for(int i=0;i<lena;i++)
        {
            a[s1.charAt(i)-97]+=1;
            b[s2.charAt(i)-97]+=1;
        }
        
        if(Arrays.equals(a,b))
            return true;
        
        for(int i=1;i<=lenb-lena;i++)
        {
            b[s2.charAt(i+lena-1)-97]+=1;
            b[s2.charAt(i-1)-97]-=1;
            
            if(Arrays.equals(a,b))
                return true;
        }
        
        return false;
    }
}