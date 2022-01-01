class Solution {
    int res;
    public int minimumSemesters(int n, int[][] relations) {
        
        int len = relations.length;
        int[][] courses = new int[n+1][n+1];
        int[] visited = new int[n+1];
        int[] sem = new int[n+1];
        
        if(len==1)
            return len+1;
        
        for(int i=0; i<len; i++) {
            int x = relations[i][0];
            int y = relations[i][1];
            
            int j = courses[x][0];
            courses[x][j+1] = y;
            courses[x][0]++;
        }
        
        for(int i=1; i<=n; i++) {
            if(visited[i]==1 || courses[i][0]==0)
                continue;
            
            visited[i] = 2;
            //int count=0;
            for(int j=1; j<=courses[i][0]; j++) {
                int m = courses[i][j];
                if(visited[m]==1) {
                    
                    sem[i] = (sem[m]>=sem[i])? 1+Math.max(sem[m], sem[i]) : sem[i];
                    continue;
                }
                if(visited[m]==2)
                    return -1;
                
                visited[m]=2;
                //count++;
                int temp = dfs(courses, visited, sem, m, 0);
                if(temp==-1)
                    return -1;
                
                sem[i]=(sem[i]<=temp) ? 1+temp : sem[i];
              //  sem[i] = (sem[i]==0)? 1+sem[m] : Math.max(sem[m], sem[i]);
                visited[m]=1;
            }
            visited[i]=1;
        }
        
        for(int i=1; i<=n; i++) {
            //System.out.println(sem[i]);
            if(res<sem[i])
                res = sem[i];
        }
        
        return res+1;
    }
    
    public int dfs(int[][] courses, int[] visited, int[] sem, int i, int count) {
        
        if(courses[i][0]==0)
            return 0;
        
        int res=0;
        for(int j=1; j<=courses[i][0]; j++) {
            
            int m = courses[i][j];
            if(visited[m]==1) {
                sem[i]= (sem[m]>=sem[i])? 1+Math.max(sem[m], sem[i]) : sem[i];
                continue;
            }
            if(visited[m]==2)
                return -1;
            visited[m]=2;
            res = dfs(courses, visited, sem, m, count);
            if(res==-1)
                return -1;
            //sem[i] = 1+res;
            sem[i]=(sem[i]<=res) ? 1+res : sem[i];
            visited[m]=1;
           // sem[i] = (sem[i]==0)? 1+sem[m] : Math.max(sem[m], sem[i]);
        }
        
        return res >=0 ? sem[i] : -1;
        
    }
}