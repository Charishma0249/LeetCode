class Solution {
    
    int count =0, rlen=0, collen=0, tempCount,dist=0;
    int[][] visited;
    public int shortestDistance(int[][] grid) {
       
        rlen = grid.length;
        collen = grid[0].length;
        int minDist = Integer.MAX_VALUE;
        Queue<int[]> qu = new LinkedList<>();
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                if(grid[i][j]==1) 
                    count++;
            }
        }
        
        //System.out.println("count = "+count);
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                if(grid[i][j]==0) {
                    tempCount=0;
                    dist=0;
                    visited = new int[rlen][collen];
                    
                    qu.offer(new int[]{i,j,0});
                    while(!qu.isEmpty()) {
                        //Pair p = qu.poll();
                        int[] p = qu.poll();
                        int x = p[0];
                        int y = p[1];
                        int c = p[2];
                        
                        if(grid[x][y]==0) {
                            if(x+1<rlen && visited[x+1][y]==0) {
                                visited[x+1][y]=1;
                                qu.offer(new int[]{x+1, y, c+1}); 
                            }
                            if(y-1>=0 && visited[x][y-1]==0) {
                                visited[x][y-1]=1;
                                qu.offer(new int[]{x, y-1, c+1});
                            }
                            if(x-1>=0 && visited[x-1][y]==0) {
                                visited[x-1][y]=1;
                                qu.offer(new int[]{x-1, y, c+1});
                            }
                            if(y+1<collen && visited[x][y+1]==0){
                                visited[x][y+1]=1;
                                qu.offer(new int[]{x, y+1, c+1});
                            }
                            continue;
                            
                        }
                        else if(grid[x][y]==1) {
                            tempCount++;
                            dist+=c;
                            // System.out.println("i = "+i+" j = "+j);
                            // System.out.println(tempCount);
                            // System.out.println("dist = "+dist);
                        }

                        
                        if(count+1==tempCount)
                            break;
                    }
                    
                    if(count==tempCount) {
                        minDist = Math.min(minDist, dist);
                    }
                }
            }
        }
        
        return (minDist==Integer.MAX_VALUE) ? -1 : minDist;
    }
    
}

// class Pair {
//     int x;
//     int y;
//     int dist;
    
//     public Pair() {}
    
//     public Pair(int x, int y, int dist) {
//         this.x = x;
//         this.y = y;
//         this.dist=dist;
//     }
// }