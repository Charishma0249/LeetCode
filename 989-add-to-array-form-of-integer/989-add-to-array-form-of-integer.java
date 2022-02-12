class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> al = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        while(k>0){
            al.add(k%10);
            k=k/10;
            
        }
        
        int i, j, carry=0;
        for(i=num.length-1, j=0; i>=0 && j<al.size(); i--, j++){
            int sum = num[i]+al.get(j)+carry;
            // System.out.println(sum);
            if(sum/10>0){
                carry = sum/10;
                res.add(sum%10);
                // System.out.println(sum%10);
            }
            else{
                carry=0;
                res.add(sum);
            }
        }
        
        for(int n=i; n>=0; n--){
            int sum=0;
            if(carry>0)
                sum = carry+num[n];
            else
                sum = num[n];
            if(sum/10>0){
                carry = sum/10;
                res.add(sum%10);
                // System.out.println(sum%10);
            }
            else{
                carry=0;
                res.add(sum);
            }
            // res.add(sum);
        }
        
        for(int n=j; n<al.size(); n++){
            int sum=0;
            if(carry>0)
                sum = carry+al.get(n);
            else
                sum = al.get(n);
            if(sum/10>0){
                carry = sum/10;
                res.add(sum%10);
                // System.out.println(sum%10);
            }
            else{
                carry = 0;
                res.add(sum);
            }
            // res.add(sum);
        }
        if(carry==1)
            res.add(carry);
        
        for(int n=res.size()-1; n>=0; n--){
            result.add(res.get(n));
        }
        return result;
    }
}