class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]-arr[i-1]);
        }
        
        for(int i=1; i<arr.length; i++){
            int diff = arr[i]-arr[i-1];
            
            if(min==diff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }
        
        return res;
    }
}