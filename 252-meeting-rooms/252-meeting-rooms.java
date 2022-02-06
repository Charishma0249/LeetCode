class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            
            @Override
            public int compare(int[] a1, int[] a2){
                if(a1[0]>a2[0])
                    return 1;
                else if(a1[0]<a2[0])
                    return -1;
                else {
                    if(a1[1]>a2[1])
                        return 1;
                    else if(a1[1]<a2[1])
                        return -1;
                    
                    return 0;
                }
            }
        });
        
        for(int i=0; i<intervals.length-1; i++) {
            if(intervals[i][1]>intervals[i+1][0])
                return false;
        }
        
        return true;
    }
}

// [0,6], [7,8]
// overlapping cases
// [0,6], [4,7]
// [0,6], [0,8]
// [0,6], [1,4]