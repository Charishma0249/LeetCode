import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int rlen = intervals.length, counter =0;
//         final Comparator<int[]> customComparator = new Comparator<int[]>() {
            
//             @Override
//             public int compare(int[] a, int[] b) {
//                 if(a[0]>b[0]) {
//                     if(a[1]>b[1])
//                         return 1;
//                     else
//                         return 0;
//                 } else if(a[0]==b[0]) {
//                     if(a[1]<b[1])
//                         return -1;
//                     else
//                         return 0;
//                 } else if(a[0]<b[0]) {
//                     if(a[1]<b[1])
//                         return -1;
//                     else 
//                         return -1;
//                 } 
//                 return 0;
//             }
//         };
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // for(int i=0; i<rlen; i++) {
        //     System.out.println(intervals[i][0]+" "+intervals[i][1]);
        // }
        int j=0;
        for(int i=1; i<rlen; i++) {
            if(intervals[i][0]>=intervals[j][1]) {
                j = i;
            } 
            else if(intervals[i][0]>intervals[j][0] && intervals[i][1]>intervals[j][1]) {
                counter++;
            }
            else if(intervals[i][0]==intervals[j][0] && intervals[i][1]>intervals[j][1]) {
                counter++;
            }
            else if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]) {
                counter++;
                j = i;
            }
        }
        
        // for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }
        // return hm.size() == 0? 0 : rlen-hm.size();
        return counter;
    }
    
}