class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int large = 0;
        List<Boolean> al = new ArrayList<Boolean>();
        
        for(int i:candies)
        {
            if(large<i)
                large=i;
        }
        
        for(int i:candies)
        {
            if(i+extraCandies >= large)
                al.add(true);
            else
                al.add(false);
        }
        
        return al;
    }
}