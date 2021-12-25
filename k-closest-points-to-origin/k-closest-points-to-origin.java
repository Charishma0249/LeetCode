class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] res = new int[k][2];
        PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>(){
            
            @Override
            public int compare(Point p1, Point p2) {
                if(p1.distance>p2.distance)
                    return 1;
                else if(p1.distance<p2.distance)
                    return -1;
                return 0;
            }
        });
        
        for(int i=0; i<points.length; i++) {
            
            int d = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Point(points[i][0], points[i][1], d));
        }
        
        // int j=pq.size();
        // while(j>0) {
        //     System.out.println(pq.poll().toString());
        //     j--;
        // }
        int i=0;
        while(k>0) {
            Point p = pq.poll();
            res[i][0] = p.x;
            res[i][1] = p.y;
            i++;
            k--;
        }
        
        return res;
    }
}

class Point {
    int x;
    int y;
    int distance;
    
    public Point() {}
    
    public Point(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
    
    public String toString() {
        return "x = "+this.x+" y = "+this.y+" d = "+this.distance;
    }
}