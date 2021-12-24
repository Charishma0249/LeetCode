class Solution {
    public int[] findBuildings(int[] heights) {
        
        int len = heights.length;
        int max = Integer.MIN_VALUE;
        int count=0;
        int[] buildings;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=len-1; i>=0; i--) {
            if(heights[i]>max) {
                max = heights[i];
                al.add(i);
            }
        }
        
        buildings = new int[al.size()];
        for(int i=al.size()-1, j=0; i>=0; i--, j++) 
            buildings[j] = al.get(i);
        
        
        return buildings;
    }
}