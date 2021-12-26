class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        StringBuilder sb = new StringBuilder();
        int wlen = word.length(), alen = abbr.length();
        int start = 'a';
        int end = 'z';
        int count = -1, temp=0;
        for(int i=0; i<alen; ) {
            
            int ac = abbr.charAt(i);
            if(ac>=start & ac<=end) {
                sb.append(abbr.charAt(i));
                //count++;
                temp++;
                i++;
            }
            else {
                if(ac-'0'==0)
                    return false;
                StringBuilder num = new StringBuilder();
                while(i<alen && ac<start) {
                    num.append(abbr.charAt(i));
                    i++;
                    if(i<alen)
                        ac = abbr.charAt(i);
                }
                
                int k=0;
                int n=0;
                int len = num.length();
               // System.out.println(sb);
                while(k<len) {
                    n+=(num.charAt(len-k-1)-'0')*Math.pow(10,k);
                   // System.out.println(n);
                    k++;
                }
                
                k=temp;
                int l=1;
                while(k<wlen && l<=n) {
                    sb.append(word.charAt(k));
                    l++;
                    k++;
                }
                if(l<=n)
                    return false;
                //count =k;
                temp+=n;
            }
        }
        
      //  System.out.println(sb);
        if(sb.toString().equals(word))
            return true;
        return false;
    }
}


// 1. using abbr, take out the numbers from the string.
// 2. now add the numbers to get the next character from word
// 3. check if the charcter matches the one in the abbr