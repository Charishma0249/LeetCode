class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr1.length; i++)
            hs.add(arr1[i]);
        for(int i=0; i<arr2.length; i++)
            hs2.add(arr2[i]);
        
        for(int i=0; i<arr3.length; i++) {
            
            if(hs.contains(arr3[i]) && hs2.contains(arr3[i]))
                al.add(arr3[i]);
        }
        
        return al;
    }
}