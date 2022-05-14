class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        
        int sum = 0, count=0;
        
        for(int i=0; i<k; i++){
            sum += calories[i];
        }
        int j=0;
        int prev = calories[j];
        for(int i=k; i<calories.length; i++){
            
            if(sum<lower)
                count--;
            else if(sum>upper)
                count++;
            
            sum = sum-prev+calories[i];
            prev = calories[++j];
            // System.out.println(count);
            
        }
        if(sum<lower)
                count--;
        else if(sum>upper)
                count++;
        // System.out.println(count);
        return count;
    }
}