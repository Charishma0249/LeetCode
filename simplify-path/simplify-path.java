class Solution {
    public String simplifyPath(String path) {
        
        int len = path.length();
        StringBuilder sb = new StringBuilder();
        int count=0, count1=0;
        for(int i=0; i<len; ) {
            
            char c = path.charAt(i);
            //System.out.println(c);
            if(c=='/') {
                if(sb.length()>0 && sb.charAt(sb.length()-1)=='/') {
                    i++;
                    continue;
                }
                if(i==len-1) {
                    if(sb.length()==0) 
                        sb.append(c);
                    i++;
                    continue;
                }
                if(i<len-1 && path.charAt(i+1)=='/') {
                    i++;
                    continue;
                }
                sb.append(c);
                i++;
            }
            else if(c=='.' && sb.length()>0 && sb.charAt(sb.length()-1)=='/') {
                count=0;
                count1=0;
                while(i<len && c!='/') {
                    if(c=='.')
                        count++;
                    else
                        count1++;
                    i++;
                    
                    if(i<len)
                        c = path.charAt(i);
                }
                if(count==2 && count1==0) {
                    int slen = sb.length();
                    if(slen>0)
                        sb.deleteCharAt(slen-1);
                    
                    int l = sb.length()-1;
                    
                    while(sb.length()>0 && sb.charAt(l)!='/') {
                        sb.deleteCharAt(l);
                        l--;
                    }
                    if(sb.length()==0)
                        sb.append('/');
                }
                if(count>2 || count1>0) {
                    while(count>0) {
                        sb.append('.');
                        count--;
                    }
                    while(count1>0) {
                        int temp = i-count1;
                        sb.append(path.charAt(temp));
                        count1--;
                    }
                }
            }
            else {
                
                while(i<len && (c!='/')) {
                    //System.out.println(c);
                    sb.append(c);
                    i++;
                    if(i<len)
                        c = path.charAt(i);
                }
            }
                
        }
        
        len = sb.length()-1;
        if(len>1) {
        char c = sb.charAt(len);
        while(len>=0 && c=='/') {
            sb.deleteCharAt(len);
            len--;
            if(len>=0)
                c = sb.charAt(len);
        }
        }
        return sb.toString();
    }
}