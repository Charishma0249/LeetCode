class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int len = trust.length;
        int[] arr = new int[len+2];
        //int count =1;
        //int a = trust[0][1];
        
        for(int i=0;i<len;i++)
        {
            arr[trust[i][0]]--;
            arr[trust[i][1]]++;
        }
        
        for(int i=1;i<len+2;i++)
        {
            if(arr[i]==n-1)
                return i;
        }
        
        return -1;
    }
}