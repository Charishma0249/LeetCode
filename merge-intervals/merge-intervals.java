class Solution {
    public int[][] merge(int[][] intervals) {
        
        int len = intervals.length;
        
        if(len==1)
            return intervals;
        
        
        Arrays.sort(intervals, (a1, a2) -> Integer.compare(a1[0], a2[0]));
        
        int count=0;
        for(int i=1; i<len; i++)
        {
            if(intervals[i][0]<=intervals[i-1][1])
            {
                if(intervals[i][1]<intervals[i-1][1])
                {
                    intervals[i][1] = intervals[i-1][1];
                }
                
                if(intervals[i][0]>intervals[i-1][0])
                    intervals[i][0] = intervals[i-1][0];
                
                intervals[i-1][0] = -1;
                intervals[i-1][1] =-1;
                count++;
            }
        }
        
        int[][] res = new int[len-count][2];
        int j=0;
        for(int i=0; i<len; i++)
        {
            if(intervals[i][0]!=-1)
            {
                res[j][0] = intervals[i][0];
                res[j][1] = intervals[i][1];
                
                j++;
            }
        }
        
        return res;
    }
}