import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int rlen = intervals.length, counter = 0;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int j=0;
        for(int i=1; i<rlen; i++) {
            if(intervals[i][0]>=intervals[j][1]) {
                j = i;
            } 
            else if(intervals[i][0]>=intervals[j][0] && intervals[i][1]>intervals[j][1]) {
                counter++;
            }
            else if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]) {
                counter++;
                j = i;
            }
        }
        
        return counter;
    }
    
}