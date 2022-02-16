class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int min = arr[arr.length-1];
        List<List<Integer>> res = new ArrayList<>();
        // int[] temp = new int[arr.length];
        
        for(int i=1; i<arr.length; i++){
            int diff = arr[i]-arr[i-1];
            if(diff<min){
                res.clear();
                res.add(Arrays.asList(arr[i-1], arr[i]));
                min = diff;
            }
            else if(diff==min)
                res.add(Arrays.asList(arr[i-1], arr[i]));
            
        }
        
        return res;
    }
}