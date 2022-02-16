class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int min = arr[arr.length-1];
        List<List<Integer>> res = new ArrayList<>();
        int[] temp = new int[arr.length];
        
        for(int i=1; i<arr.length; i++){
            temp[i-1] = arr[i]-arr[i-1];
            min = Math.min(min, temp[i-1]);
            
        }
        
        for(int i=1; i<arr.length; i++){
            int diff = temp[i-1];
            
            if(min==diff){
                // List<Integer> pair = new ArrayList<>();
                // pair.add(arr[i-1]);
                // pair.add(arr[i]);
                res.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        
        return res;
    }
}