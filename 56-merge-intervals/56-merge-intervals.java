class Solution {
    public int[][] merge(int[][] intervals) {
        
        int len = intervals.length;
        ArrayList<int[][]> al = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(int[] a1, int[] a2){
                
                if(a1[0]>a2[0])
                    return 1;
                else if(a2[0]>a1[0])
                    return -1;
                else{
                    if(a1[0]==a2[0]){
                        if(a1[1]>a2[1])
                            return 1;
                        return -1;
                    }
                    else
                        return 0;
                }
            }
        });
        
        pq.addAll(Arrays.asList(intervals));
        
        while(!pq.isEmpty()){
            
            int[] n1 = pq.poll();
            if(pq.isEmpty()){
                int[][] n = {{n1[0], n1[1]}};
                al.add(n);
                continue;
            }
            int[] n2 = pq.poll();
            
            if(n1[1]<n2[0] && n2[1]>n1[1]){
                int[][] n = {{n1[0], n1[1]}};
                al.add(n);
                pq.add(n2);
                continue;
            }
            else if(n2[0]==n1[1]){
                if(n2[1]>=n1[1]){
                    int[][] n = {{n1[0], n2[1]}};
                    pq.addAll(Arrays.asList(n));
                }
            }
            else if(n2[0]<n1[1]){
                if(n2[1]<n1[1]){
                    int[][] n = {{n1[0], n1[1]}};
                    pq.addAll(Arrays.asList(n));
                }
                else{
                    // System.out.println("n2[0] = "+n2[0]+" n2[1] = "+n2[1]);
                    int[][] n = {{n1[0], n2[1]}};
                    pq.addAll(Arrays.asList(n));
                }
            }
                
        }
        
        int[][] res = new int[al.size()][2];
        for(int i=0; i<al.size(); i++){
            int[][] n = al.get(i);
            res[i][0] = n[0][0];
            res[i][1] = n[0][1];
        }
        return res;
        // return new int[0][0];
    }
}