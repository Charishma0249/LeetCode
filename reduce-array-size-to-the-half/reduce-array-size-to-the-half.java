class Solution {
    public int minSetSize(int[] arr) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            
            @Override
            public int compare(Pair a, Pair b) {
                if(a.count<b.count)
                    return 1;
                else 
                    return -1;
            }
        });
        int len = arr.length;
        
        Arrays.sort(arr);
        int m =arr[0], count =0;
        
        for(int n : arr) {
            
            if(n != m)
            {
                pq.add(new Pair(m, count));
                count =1;
            }
            else
                count++;
            
            m = n;
            
        }
        
        pq.add(new Pair(m, count));
        
        
        count=0;
        int res =0;
        while(count<len/2) {
            Pair p = pq.poll();
            count+=p.count;
            
            res++;
        }
        
        return res;
    }
}

class Pair {
    
    int n;
    int count;
    
    public Pair(int n, int count) {
        this.n = n;
        this.count = count;
    }
        
}